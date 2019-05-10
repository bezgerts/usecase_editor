package me.bezgerts.usecaseeditor.service;

import me.bezgerts.usecaseeditor.domain.Precondition;

import java.util.List;

public interface PreconditionSevice {
    void save(Precondition precondition);
    List<Precondition> getAllPreconditions();
}
