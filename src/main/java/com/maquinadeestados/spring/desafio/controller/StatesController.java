package com.maquinadeestados.spring.desafio.controller;

import com.maquinadeestados.spring.desafio.entity.States;
import com.maquinadeestados.spring.desafio.repository.StatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/states")
public class StatesController {

    @Autowired
    StatesRepository statesRepository;

    @GetMapping
    public ResponseEntity<List<States>> allStates(){
        List<States> listStates = statesRepository.findAll();
        return new ResponseEntity<List<States>>(listStates, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<States> getOneStates(@PathVariable(value = "id") long id){
        Optional<States> states = statesRepository.findById(id);
        return states.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<States> addStates(@RequestBody States states){
        return new ResponseEntity<States>(statesRepository.save(states), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStates(@PathVariable(value = "id") long id){
        Optional<States> states = statesRepository.findById(id);
        if(states.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else{
            statesRepository.delete(states.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<States> updateStates(@PathVariable(value = "id") long id,
                                               @RequestBody States states){
        Optional<States> state = statesRepository.findById(id);
        if(state.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else{
            states.setId(state.get().getId());
            return new ResponseEntity<States>(statesRepository.save(states), HttpStatus.OK);
        }
    }
}
