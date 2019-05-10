package me.bezgerts.usecaseeditor.service;

import me.bezgerts.usecaseeditor.domain.Precondition;
import me.bezgerts.usecaseeditor.repository.PreconditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PreconditionServiceImpl implements PreconditionSevice {

    @Autowired
    private PreconditionRepository repository;

    public PreconditionServiceImpl() {
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Precondition precondition) {
        repository.save(precondition);
    }

    @Override
    public List<Precondition> getAllPreconditions() {
        return repository.findAll();
    }
}
