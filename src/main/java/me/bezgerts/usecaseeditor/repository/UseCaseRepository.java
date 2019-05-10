package me.bezgerts.usecaseeditor.repository;

import me.bezgerts.usecaseeditor.domain.UseCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UseCaseRepository extends CrudRepository<UseCase, Long> {
    List<UseCase> findAll();
}
