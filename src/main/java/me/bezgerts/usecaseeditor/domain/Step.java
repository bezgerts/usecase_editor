package me.bezgerts.usecaseeditor.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Step {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String textDescription;

    @ManyToMany(mappedBy = "steps")
    @JsonBackReference
    private List<UseCase> useCases;

    public Step() {
    }

    public Step(String textDescription, List<UseCase> useCases) {
        this.textDescription = textDescription;
        this.useCases = useCases;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "Step{" +
                "id=" + id +
                ", textDescription='" + textDescription + '\'' +
                ", useCases=" + useCases +
                '}';
    }
}
