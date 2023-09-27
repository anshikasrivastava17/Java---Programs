/* Write a Java program to show inheritance. Make classes grandfather, father and son and then inherit the properties from other classes. */

class grandfather {
    String gprop = "House";

    void disp1() {
        System.out.println("Grandfather has house");
    }
}

class Father extends grandfather {
    String fprop = "Car";

    void disp2() {
        System.out.println("Father has car");
    }
}

class Son extends Father {
    String sprop = "Bike";

    void disp3() {
        System.out.println("Son has bike");
    }
}
public class Family {
    public static void main(String args[]) {
        Son s = new Son();
        System.out.println("Son has " + s.gprop);
        System.out.println("Son has " + s.fprop);
        System.out.println("Son has " + s.sprop);
        System.out.println("Father has " + s.gprop);
        s.disp1();
        s.disp2();
        s.disp3();
    }}
