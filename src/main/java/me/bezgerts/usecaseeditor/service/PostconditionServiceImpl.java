package me.bezgerts.usecaseeditor.service;

import me.bezgerts.usecaseeditor.domain.Postcondition;
import me.bezgerts.usecaseeditor.repository.PostconditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostconditionServiceImpl implements PostconditionService {

    @Autowired
    private PostconditionRepository repository;

    public PostconditionServiceImpl() {
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Postcondition postcondition) {
        repository.save(postcondition);
    }
}
