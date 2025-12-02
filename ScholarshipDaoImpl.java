package com.codegnan.dao;

import java.util.ArrayList;
import java.util.List;

import com.codegnan.exceptions.ScholarshipNotFoundException;
import com.codegnan.model.Scholarship;

public class ScholarshipDaoImpl implements ScholarshipDao {

    List<Scholarship> list = new ArrayList<>();

    @Override
    public void save(Scholarship scholarship) {
        list.add(scholarship);
    }

    @Override
    public List<Scholarship> findAll() {
        return list;
    }

    @Override
    public Scholarship findById(int id) throws ScholarshipNotFoundException {
        for (Scholarship s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new ScholarshipNotFoundException("Scholarship with ID " + id + " not found");
    }

    @Override
    public Scholarship update(Scholarship scholarship) throws ScholarshipNotFoundException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == scholarship.getId()) {
                list.set(i, scholarship);
                return scholarship;
            }
        }
        throw new ScholarshipNotFoundException("Cannot update — ID " + scholarship.getId() + " not found");
    }

    @Override
    public void deleteById(int id) throws ScholarshipNotFoundException {
        boolean removed = list.removeIf(s -> s.getId() == id);

        if (!removed) {
            throw new ScholarshipNotFoundException("Cannot delete — ID " + id + " not found");
        }
    }
}
