package com.upgrad.demo.service.impl;

import com.upgrad.demo.dao.IdeaDAO;
import com.upgrad.demo.dto.IdeaDTO;
import com.upgrad.demo.entities.IdeaDO;
import com.upgrad.demo.service.IdeaService;
import com.upgrad.demo.util.IdeaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
/**
 * This service annotation indicates 2 things :-
 * 1. This class is acting as a service.
 * 2. This class helps that to identify that the bean of this class has to be created.
 */
public class IdeaServiceImpl implements IdeaService {

    @Autowired
    /**
     * Since the IdeaServiceImpl is dependent to the IdeaDAO
     * so we just using the dependency injection
     * by using the annotation called @Autowired
     * so it just injecting the dependency.
     */
    private IdeaDAO ideaDAO;

    @Override
    public void saveIdea(IdeaDTO ideaDTO) {
        ideaDAO.save(IdeaUtil.convertIdeaDTOtoIdeaDO(ideaDTO));
    }

    @Override
    public IdeaDTO getIdea(long id) {
        return IdeaUtil.convertIdeaDOtoIdeaDTO(ideaDAO.find(id));
    }

    @Override
    public List<IdeaDTO> getAllIdea() {
        return ideaDAO.findAll().stream().map(ideaDO -> IdeaUtil.convertIdeaDOtoIdeaDTO(ideaDO)).collect(Collectors.toList());
    }

    @Override
    public void updateIdea(IdeaDTO ideaDTO) {
        ideaDAO.update(IdeaUtil.convertIdeaDTOtoIdeaDO(ideaDTO));
    }

    @Override
    public void deleteIdea(long id) {
        ideaDAO.delete(id);
    }
}
