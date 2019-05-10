package me.bezgerts.usecaseeditor.service;

import me.bezgerts.usecaseeditor.domain.Step;
import me.bezgerts.usecaseeditor.repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StepServiceImpl implements StepService {

    @Autowired
    private StepRepository repository;

    public StepServiceImpl() {
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Step step) {
        repository.save(step);
    }
}
