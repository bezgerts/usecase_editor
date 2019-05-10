package me.bezgerts.usecaseeditor.service;

import me.bezgerts.usecaseeditor.domain.UseCase;
import me.bezgerts.usecaseeditor.repository.UseCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UseCaseServiceImpl implements UseCaseService {

    @Autowired
    private UseCaseRepository repository;

    public UseCaseServiceImpl() {
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(UseCase useCase) {
        repository.save(useCase);
    }

    @Override
    public List<UseCase> findAll() {
        return repository.findAll();
    }
}
