package com.weintern.service;

import com.weintern.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> students = new ArrayList<>();
    private int nextRollNumber = 1;

    public void manager() {

        while (true) {
            System.out.println("----- Student Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("Select Operation: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    scanner.close();
                    System.out.print("Exiting");
                    try {
                        for (int i=0; i<3; i++) {
                            Thread.sleep(500);
                            System.out.print(".");
                        }
                        System.out.println();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public void addStudent() {
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Student Class: ");
        String studentClass = scanner.nextLine();
        System.out.println("Enter Student Marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine();

        Student newStudent = new Student(name, studentClass, marks, nextRollNumber++);
        students.add(newStudent);
        System.out.println("Student added successfully!");
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("No students records found.");
            return;
        }
        System.out.println("Student Records:");
        for (Student student : students) {
            System.out.println(student.showStudents());
        }
    }

    public void searchStudent() {
        if (students.isEmpty()) {
            System.out.println("No students records found.");
            return;
        }

        System.out.println("Enter Student Name Or Roll Number To Search: ");
        String searchInput = scanner.nextLine().trim();
        boolean found = false;

        for (Student student : students) {
            if (String.valueOf(student.getRollNumber()).equals(searchInput) || student.searchStudents().equalsIgnoreCase(searchInput)) {
                System.out.println(student.showStudents());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found!");
        }
    }

    public void updateStudent() {
        if (students.isEmpty()) {
            System.out.println("No students records found.");
            return;
        }

        System.out.println("Enter Roll Number Of The Student To Update: ");
        int roll = scanner.nextInt();
        scanner.nextLine();

        Student studentToUpdate = findByRollNumber(roll);

        if (studentToUpdate != null) {
            System.out.println("Enter New Name (Or Press Enter To Keep The Same:" + studentToUpdate.searchStudents() + "): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                studentToUpdate.setName(newName);
            }

            System.out.println("Enter New Class (Or Press Enter To Keep The Same:" + studentToUpdate.getStudentClass() + "): ");
            String newClass = scanner.nextLine();
            if (!newClass.isEmpty()) {
                studentToUpdate.setStudentClass(newClass);
            }

            System.out.println("Enter New Marks (Or Enter -1 To Keep The Same:" + studentToUpdate.getMarks() + "): ");
            int newMarks = scanner.nextInt();
            scanner.nextLine();
            if (newMarks != -1) {
                studentToUpdate.setMarks(newMarks);
            }

            System.out.println("Student details updated successfully!");
        } else {
            System.out.println("Student with Roll Number " + roll + " not found!");
        }
    }

    public void deleteStudent() {
        if (students.isEmpty()) {
            System.out.println("No students records found.");
            return;
        }

        System.out.println("Enter Roll Number Of The Student To Delete: ");
        int roll = scanner.nextInt();
        scanner.nextLine();

        Student studentToDelete = findByRollNumber(roll);

        if (studentToDelete != null) {
            students.remove(studentToDelete);
            System.out.println("Student with Roll Number " + roll + " has been deleted successfully!");
        } else {
            System.out.println("Student with Roll Number " + roll + " not found!");
        }
    }

    private Student findByRollNumber(int roll) {
        for (Student student : students) {
            if (student.getRollNumber() == roll) {
                return student;
            }
        }
        return null;
    }
}