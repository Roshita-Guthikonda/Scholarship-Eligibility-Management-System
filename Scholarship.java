package com.codegnan.model;

public class Scholarship {

    private int id;
    private String studentName;
    private double percentage;
    private double familyIncome;
    private String status;

    public Scholarship() {}

    public Scholarship(int id, String studentName, double percentage, double familyIncome, String status) {
        this.id = id;
        this.studentName = studentName;
        this.percentage = percentage;
        this.familyIncome = familyIncome;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getFamilyIncome() {
        return familyIncome;
    }
    public void setFamilyIncome(double familyIncome) {
        this.familyIncome = familyIncome;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Scholarship [id=" + id + ", studentName=" + studentName +
               ", percentage=" + percentage + ", familyIncome=" +
               familyIncome + ", status=" + status + "]";
    }
}
