package com.bptn.course.challenge._03_week;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create an instance of University
        University university = new University();

        // Create student objects
        Student student1 = new Student(123, "testUsername1", "password1", "John", "Doe", 
                "john.doe@example.com", "123-456-7890", "123 Main St", "Male", 
                new Date(), new Date(), 1001, "Computer Science");
        
        Student student2 = new Student(456, "testUsername2", "password2", "Jane", "Smith", 
                "jane.smith@example.com", "098-765-4321", "456 Oak St", "Female", 
                new Date(), new Date(), 1002, "Mechanical Engineering");
        
        Student student3 = new Student(789, "studentTest3", "password3", "Alice", "Johnson", 
                "alice.johnson@example.com", "111-222-3333", "789 Pine St", "Female", 
                new Date(), new Date(), 1003, "Electrical Engineering");

        // Add students to the university
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        // Display all students in the university
        System.out.println("\nUniversity ------ \n" + university.getStudents());

        // Get a student by ID (123)
        System.out.println("\nGetting student------\n" + university.getStudent(123));

        // Delete a student by ID (123)
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));

        // Search for a student by username prefix ("testUserna")
        System.out.println("\nSearching student------\n" + university.searchStudent("testUserna"));

        // Display all students in the university after deletion
        System.out.println("\nUniversity ------ \n" + university.getStudents());
    }
}
