package me.bezgerts.usecaseeditor.repository;

import me.bezgerts.usecaseeditor.domain.Precondition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreconditionRepository extends CrudRepository<Precondition, Long> {
    List<Precondition> findAll();
}
