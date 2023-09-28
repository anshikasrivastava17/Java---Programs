/* Write a program in Java 
 1) to demonstrate a model of the animal kingdom
 2) Animals are of 2 kinds - birds and mammals
 3) Create a bird object and a mammal object and display characteristics
 
 List of Characteristics
 number of wings
 number of limbs
 number of eyes
 
 Demonstrate inheritance OOPS concept by
 - identifying classes
 - identifying which characteristics belong to which class
 
 Output 
 Mammals
 Number of limbs = 4
 Number of eyes = 2 
 
 Birds
 Number of wings = 2
 Number of eyes = 2    */

class Animal {
    int limbs;
    int eyes;
    int wings;
}

class Mammals extends Animal {
    void display() {
        System.out.println("Mammals");
        System.out.println("Number of limbs = " + limbs);
        System.out.println("Number of eyes = " + eyes);
    }
}

class Birds extends Animal {
    void display() {
        System.out.println("Birds");
        System.out.println("Number of wings = " + wings);
        System.out.println("Number of eyes = " + eyes);
    }
}

public class Animal_kingdom {
    public static void main(String args[]) {
        Mammals m = new Mammals();
        m.limbs = 4;
        m.eyes = 2;

        Birds b = new Birds();
        b.wings = 2;
        b.eyes = 2;

        m.display();
        b.display();
    }
}
