package com.codegnan.controller;

import java.util.List;

import com.codegnan.exceptions.ScholarshipNotFoundException;
import com.codegnan.model.Scholarship;
import com.codegnan.service.ScholarshipService;
import com.codegnan.service.ScholarshipServiceImpl;

public class ScholarshipController {

    public static void main(String[] args) {

        ScholarshipService service = new ScholarshipServiceImpl();

        service.addScholarship(new Scholarship(1, "Harsh", 92, 180000, "Eligible"));
        service.addScholarship(new Scholarship(2, "Anita", 83, 300000, "Pending"));
        service.addScholarship(new Scholarship(3, "Sameer", 75, 250000, "Not Eligible"));

        System.out.println("All Scholarships:");
        List<Scholarship> list = service.getAllScholarship();
        for (Scholarship s : list) {
            System.out.println(s);
        }

        try {
            System.out.println("\nFetch Scholarship ID 2:");
            System.out.println(service.getScholarshipById(2));
        } catch (ScholarshipNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("\nUpdating Scholarship ID 3:");
            Scholarship updated = service.updateScholarship(
                    new Scholarship(3, "Sameer", 78, 240000, "Eligible"));
            System.out.println(updated);
        } catch (ScholarshipNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("\nDeleting Scholarship ID 1:");
            service.deleteScholarship(1);
        } catch (ScholarshipNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal List:");
        for (Scholarship s : service.getAllScholarship()) {
            System.out.println(s);
        }
    }
}