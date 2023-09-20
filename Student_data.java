
/* Write a program in Java
1) Take user input for 3 students
2) Insert name of roll no. of 3 students and then display them
3) Write separate functions to insert the information and display the information
4) Program must contain 2 classes

Output:
Enter Student name
Enter Student roll number
The students present in the database are
----
----
---- 

@author : Anshika Srivastava
Roll number : R2142220907
SAP ID: 500107049
Date : 20/09/2023  */
import java.util.Scanner;

class database {
    int rollno;
    String name;

    void insertRecord() {

        Scanner o1 = new Scanner(System.in);
        Scanner o2 = new Scanner(System.in);
        System.out.println("Enter Student name");
        name = o1.next();
        System.out.println("Enter Student roll number");
        rollno = o2.nextInt();
    }

    void dispinfo() {
        System.out.println(rollno + "  " + name);
    }
}

public class Student_data {
    public static void main(String args[]) {
        database s1 = new database();
        database s2 = new database();
        database s3 = new database();
        s1.insertRecord();
        s2.insertRecord();
        s3.insertRecord();
        System.out.println("The students present in the database are");
        s1.dispinfo();
        s2.dispinfo();
        s3.dispinfo();
    }
}