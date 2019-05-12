package me.bezgerts.usecaseeditor.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class UseCase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    private String description;

    @ManyToMany
    @JsonManagedReference
    private List<Precondition> preconditions;

    @ManyToMany
    @JsonManagedReference
    private List<Step> steps;

    @ManyToMany
    @JsonManagedReference
    private List<Postcondition> postconditions;

    public UseCase() {
    }

    public UseCase(String title, String description,
                   List<Precondition> preconditions, List<Step> steps,
                   List<Postcondition> postconditions) {
        this.title = title;
        this.description = description;
        this.preconditions = preconditions;
        this.steps = steps;
        this.postconditions = postconditions;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Precondition> getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(List<Precondition> preconditions) {
        this.preconditions = preconditions;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public List<Postcondition> getPostconditions() {
        return postconditions;
    }

    public void setPostconditions(List<Postcondition> postconditions) {
        this.postconditions = postconditions;
    }

    @Override
    public String toString() {
        return "UseCase{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", preconditions=" + preconditions +
                ", steps=" + steps +
                ", postconditions=" + postconditions +
                '}';
    }
}
