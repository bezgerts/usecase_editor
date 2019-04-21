package me.bezgerts.usecaseeditor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@RestController
public class RouterController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String getMessage(){
        try {
            return "hello from docker\n" + usecases();
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    private String usecases() throws SQLException {
        String result = null;
        Statement statement = null;
        String query = "SELECT * FROM postgres.public.usecase";
        StringBuffer buffer = new StringBuffer();


        try {
            Connection con = dataSource.getConnection();
            statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            buffer.append("New string\n");
            while (resultSet.next()) {
                buffer.append("ID: " + resultSet.getInt("id"));
                buffer.append("\n");
                buffer.append("Description: " + resultSet.getString("description"));
                buffer.append("\n");
                buffer.append("Title: " + resultSet.getString("title"));
            }

            result = buffer.toString();

        } catch (SQLException ex) {
            result = ex.getMessage();
        } finally {
            if (statement != null) {
                statement.close();
            }
        }

        return result;
    }
}
