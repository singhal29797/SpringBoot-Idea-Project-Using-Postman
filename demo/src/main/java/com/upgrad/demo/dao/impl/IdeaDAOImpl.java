package com.upgrad.demo.dao.impl;

import com.upgrad.demo.dao.IdeaDAO;
import com.upgrad.demo.entities.IdeaDO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
/**
 * This is the class which is responsible for storing and retrieving
 * the data from database so i calling it by a annotation called @Repository
 */
public class IdeaDAOImpl implements IdeaDAO {

    private static final Map<Long, IdeaDO> IDEA_STORE = new HashMap<>();

    @Override
    public void save(IdeaDO ideaDO) {
        IDEA_STORE.put(ideaDO.getId(), ideaDO);
    }

    @Override
    public IdeaDO find(long id) {
        return IDEA_STORE.get(id);
    }

    @Override
    public List<IdeaDO> findAll() {
        return IDEA_STORE.values().stream().collect(Collectors.toList());
    }

    @Override
    public void update(IdeaDO ideaDO) {
        IDEA_STORE.put(ideaDO.getId(),ideaDO);
    }

    @Override
    public IdeaDO delete(long id) {
        return IDEA_STORE.remove(id) ;
    }
}
