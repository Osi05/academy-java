package com.bptn.course.challenge._03_week;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;

    // Constructor
    public University() {
        this.students = new ArrayList<>();
    }

    // Getter for students
    public List<Student> getStudents() {
        return students;
    }

    // Add a student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added: " + s.getUserName());
    }

    // Get student by ID
    public Student getStudent(long studentId) {
        for (Student s : students) {
            if (s.getStudentId() == studentId) {
                return s;
            }
        }
        return null;
    }

    // Delete student by ID
    public boolean deleteStudent(long studentId) {
        for (Student s : students) {
            if (s.getStudentId() == studentId) {
                students.remove(s);
                System.out.println("Student with ID " + studentId + " has been removed.");
                return true;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
        return false;
    }

    // Search student by username prefix
    public List<Student> searchStudent(String userNamePrefix) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getUserName().startsWith(userNamePrefix)) {
                result.add(s);
            }
        }
        return result;
    }
}