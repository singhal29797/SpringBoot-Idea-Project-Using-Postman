package com.upgrad.demo.dao;

import com.upgrad.demo.entities.IdeaDO;

import java.util.List;


/**
 * Contract of IdeaDAO layer for the CRUD operation
 */
public interface IdeaDAO {

    public void save(IdeaDO ideaDO);

    public IdeaDO find(long id);

    public List<IdeaDO> findAll();

    public void update(IdeaDO ideaDO);

    public IdeaDO delete(long id);


}
