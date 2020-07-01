package com.upgrad.demo.service;

import com.upgrad.demo.dto.IdeaDTO;
import com.upgrad.demo. entities.IdeaDO;

import java.util.List;

/**
 * Acts like a facilitator.Takes the request from controller
 * and order DAO for data manipulation
 */
public interface IdeaService {

    public void saveIdea(IdeaDTO ideaDTO);

    public IdeaDTO getIdea(long id);

    public List<IdeaDTO> getAllIdea();

    public void updateIdea(IdeaDTO ideaDTO);

    public void deleteIdea(long id);


}
