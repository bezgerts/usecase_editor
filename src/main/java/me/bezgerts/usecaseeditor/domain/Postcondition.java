package me.bezgerts.usecaseeditor.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Postcondition {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String textDescription;

    @ManyToMany(mappedBy = "postconditions")
    private List<UseCase> useCases;

    public Postcondition() {
    }

    public Postcondition(String textDescription, List<UseCase> useCases) {
        this.textDescription = textDescription;
        this.useCases = useCases;
    }

    public Long getId() {
        return id;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public List<UseCase> getUseCases() {
        return useCases;
    }

    public void setUseCases(List<UseCase> useCases) {
        this.useCases = useCases;
    }

    @Override
    public String toString() {
        return "Postcondition{" +
                "id=" + id +
                ", textDescription='" + textDescription + '\'' +
                ", useCases=" + useCases +
                '}';
    }
}
