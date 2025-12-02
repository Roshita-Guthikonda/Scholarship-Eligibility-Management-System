package com.codegnan.service;

import java.util.List;

import com.codegnan.exceptions.ScholarshipNotFoundException;
import com.codegnan.model.Scholarship;

public interface ScholarshipService {

    public void addScholarship(Scholarship scholarship);
    
    public List<Scholarship> getAllScholarship();
    
    public Scholarship getScholarshipById(int id) throws ScholarshipNotFoundException;
    
    public Scholarship updateScholarship(Scholarship scholarship) throws ScholarshipNotFoundException;
    
    public void deleteScholarship(int id) throws ScholarshipNotFoundException;

}

