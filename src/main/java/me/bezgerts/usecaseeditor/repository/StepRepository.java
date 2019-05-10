package me.bezgerts.usecaseeditor.repository;

import me.bezgerts.usecaseeditor.domain.Step;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepRepository extends CrudRepository<Step, Long> {
}
