package me.bezgerts.usecaseeditor.repository;

import me.bezgerts.usecaseeditor.domain.Postcondition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostconditionRepository extends CrudRepository<Postcondition, Long> {
}
