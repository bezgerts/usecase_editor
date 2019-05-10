package me.bezgerts.usecaseeditor.service;

import me.bezgerts.usecaseeditor.domain.UseCase;

import java.util.List;

public interface UseCaseService {
    void save(UseCase useCase);
    List<UseCase> findAll();
}
