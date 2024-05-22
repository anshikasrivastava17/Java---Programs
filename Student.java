/* Write a Java program to implement the student management system based on the provided scenario. Each student has a unique SAP ID, and their details, including name, age, and CGPA, need to be efficiently stored and managed. You are required to implement
a Java program using a HashMap where the SAP ID is used as the key, and an ArrayList is used as the value to store the student's details. You should develop methods to add students, remove students, retrieve student details by SAP ID, and view all student records.
You should use a HashMap with SAP ID as keys and ArrayList as values to organize student data. Your program should include the following methods:

addStudent(int sapId, String name, int age, double cgpa) 
removeStudent(int sapId) 
getStudentDetails(int sapId) 
viewAllStudents() */

import java.util.*;

class Student { // user defined array list
    private String name;
    private int age;
    private double cgpa;

    public Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", CGPA: " + cgpa;
    }
}

public class q4 {
    private HashMap<Integer, ArrayList<Student>> map; // key for sap , array list as value

    public q4() {
        this.map = new HashMap<>();
    }

    public void addStudent(int sapId, String name, int age, double cgpa) {
        Student student = new Student(name, age, cgpa); // object of array list
        if (!map.containsKey(sapId)) {
            map.put(sapId, new ArrayList<>()); // values added in map
        }
        map.get(sapId).add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(int sapId) {
        if (map.containsKey(sapId)) {
            map.remove(sapId);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student with SAP ID " + sapId + " not found.");
        }
    }

    public void getStudentDetails(int sapId) {
        if (map.containsKey(sapId)) {
            ArrayList<Student> students = map.get(sapId);
            for (Student student : students) { // keyset
                System.out.println("SAP ID: " + sapId + ", " + student.toString());
            }
        } else {
            System.out.println("Student with SAP ID " + sapId + " not found.");
        }
    }

    public void viewAllStudents() {
        if (map.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Map.Entry<Integer, ArrayList<Student>> entry : map.entrySet()) {
                int sapId = entry.getKey();
                ArrayList<Student> students = entry.getValue();
                for (Student student : students) {
                    System.out.println("SAP ID: " + sapId + ", " + student.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        q4 sms = new q4();

        sms.addStudent(1, "Noah Centineo", 28, 9.8);
        sms.addStudent(2, "Franz Kafka", 72, 10);
        sms.addStudent(3, "Salman Zaidi", 30, 8); // Adding another student with the same SAP ID
        sms.removeStudent(2);
        sms.getStudentDetails(3);
        sms.viewAllStudents();
    }
}
