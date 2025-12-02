package com.codegnan.service;

import java.util.List;

import com.codegnan.dao.ScholarshipDao;
import com.codegnan.dao.ScholarshipDaoImpl;
import com.codegnan.exceptions.ScholarshipNotFoundException;
import com.codegnan.model.Scholarship;

public class ScholarshipServiceImpl implements ScholarshipService {

    ScholarshipDao dao = new ScholarshipDaoImpl();

    @Override
    public void addScholarship(Scholarship scholarship) {
        dao.save(scholarship);
    }

    @Override
    public List<Scholarship> getAllScholarship() {
        return dao.findAll();
    }

    @Override
    public Scholarship getScholarshipById(int id) throws ScholarshipNotFoundException {
        return dao.findById(id);
    }

    @Override
    public Scholarship updateScholarship(Scholarship scholarship) throws ScholarshipNotFoundException {
        return dao.update(scholarship);
    }

    @Override
    public void deleteScholarship(int id) throws ScholarshipNotFoundException {
        dao.deleteById(id);
    }
}
