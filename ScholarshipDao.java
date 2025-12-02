package com.codegnan.dao;

import java.util.List;

import com.codegnan.exceptions.ScholarshipNotFoundException;
import com.codegnan.model.Scholarship;

public interface ScholarshipDao {

    public void save(Scholarship scholarship);
    
    public List<Scholarship> findAll();
    
    public Scholarship findById(int id) throws ScholarshipNotFoundException;
    
    public Scholarship update(Scholarship scholarship) throws ScholarshipNotFoundException;
    
    public void deleteById(int id) throws ScholarshipNotFoundException;

}
