package com.upgrad.demo.controller;

import com.upgrad.demo.dto.IdeaDTO;
import com.upgrad.demo.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
/**
 * This RestController annotation indicates 2 points :-
 * 1. This class is defining the restful end points.
 * 2. This indicate that this is acting as a starting point of a service.
 */
@RequestMapping("/ideas")
/**
 *  This RequestMapping annotation is using to giving the path of the URI
 */

public class IdeaServiceController {

    @Autowired
    private IdeaService ideaService;

    //Write the method which will respond with POST

    @PostMapping
    public ResponseEntity<IdeaDTO> saveIdea (@RequestBody IdeaDTO ideaDTO){
        ideaService.saveIdea(ideaDTO);
        return new ResponseEntity<>(ideaDTO, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<IdeaDTO>> getAllIdeas(){
        return new ResponseEntity<>(ideaService.getAllIdea(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<IdeaDTO> getIdea(@PathVariable(name = "id") long movieId){
        return new ResponseEntity<>(ideaService.getIdea(movieId), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<IdeaDTO> updateIdea(@PathVariable(name = "id") long movieId, @RequestBody IdeaDTO ideaDTO){
        ideaService.updateIdea(ideaDTO);
        return new ResponseEntity<>(ideaDTO, HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<IdeaDTO> deleteIdea (@PathVariable(name = "id") long movieId){
        ideaService.deleteIdea(movieId);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }

}
