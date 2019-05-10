package me.bezgerts.usecaseeditor.controller;

import me.bezgerts.usecaseeditor.domain.Postcondition;
import me.bezgerts.usecaseeditor.domain.Precondition;
import me.bezgerts.usecaseeditor.domain.Step;
import me.bezgerts.usecaseeditor.domain.UseCase;
import me.bezgerts.usecaseeditor.service.PostconditionService;
import me.bezgerts.usecaseeditor.service.PreconditionSevice;
import me.bezgerts.usecaseeditor.service.StepService;
import me.bezgerts.usecaseeditor.service.UseCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RouterController {

    @Autowired
    private UseCaseService useCaseService;

    @Autowired
    private PreconditionSevice preconditionSevice;

    @Autowired
    private StepService stepService;

    @Autowired
    private PostconditionService postconditionService;

    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public UseCase createUseCase() {

        Precondition precondition1 = new Precondition();
        precondition1.setTextDescription("preCondition1");

        Precondition precondition2 = new Precondition();
        precondition2.setTextDescription("precondition2");

        preconditionSevice.save(precondition1);
        preconditionSevice.save(precondition2);

        Step step1 = new Step();
        step1.setTextDescription("step1");

        Step step2 = new Step();
        step2.setTextDescription("step2");

        stepService.save(step1);
        stepService.save(step2);

        Postcondition postcondition1 = new Postcondition();
        postcondition1.setTextDescription("postCond1");

        Postcondition postcondition2 = new Postcondition();
        postcondition2.setTextDescription("postCondition2");

        postconditionService.save(postcondition1);
        postconditionService.save(postcondition2);



        UseCase useCase = new UseCase();
        useCase.setTitle("Usecase Title");
        useCase.setDescription("Usecase Description");
        List<Precondition> preconditions = new ArrayList<>();
        preconditions.add(precondition1);
        preconditions.add(precondition2);
        useCase.setPreconditions(preconditions);
        List<Step> steps = new ArrayList<>();
        steps.add(step1);
        steps.add(step2);
        useCase.setSteps(steps);
        List<Postcondition> postconditions = new ArrayList<>();
        postconditions.add(postcondition1);
        postconditions.add(postcondition2);
        useCase.setPostconditions(postconditions);

        useCaseService.save(useCase);

        return useCaseService.findAll().get(0);
    }
}
