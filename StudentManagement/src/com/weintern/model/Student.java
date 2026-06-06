package com.weintern.model;

public class Student {
    private String name;
    private String studentClass;
    private int marks;
    private int rollNumber;

    public Student(String name, String studentClass, int marks, int rollNumber) {
        this.name = name;
        this.studentClass = studentClass;
        this.marks = marks;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String grade() {
        if (marks >= 80) {
            return "O";
        } else if (marks >= 60) {
            return "A";
        } else if (marks >= 45) {
            return "B";
        } else if (marks >= 35) {
            return "C";
        } else {
            return "F";
        }
    }

    public String showStudents() {
        return "Roll Number: " + rollNumber + "| Name: " + name + " | Class: " + studentClass + " | Marks: " + marks + " | Grade: " + grade();
    }

    public String searchStudents() {
        return name;
    }
}