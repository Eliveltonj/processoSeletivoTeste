package com.t2s.processo_seletivo.controllers;

import com.t2s.processo_seletivo.models.Container;
import com.t2s.processo_seletivo.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Container")
public class ContainerController {
    @Autowired
    ContainerRepository containerRepository;
    @PostMapping
    public ResponseEntity<Container> create(@RequestBody Container container){
        containerRepository.save(container);
        return new ResponseEntity<>(container, HttpStatus.OK);
    }
}
