package com.fagnerviana.citiesapi.staties.resources;

import java.util.List;

import com.fagnerviana.citiesapi.staties.entities.State;
import com.fagnerviana.citiesapi.staties.repositories.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }
}
