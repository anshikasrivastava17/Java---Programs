/* 1) Create a program named Simple2.java. Put it in mypack.
2) In it, create a method "void disp1()", print "This is simple2".
3) Create Simple3.java in the same package. Call "void disp1()" from here.
4) Create Simple4.java in another package. Call "void disp1()" from here using package import. 
Output - This is simple2 --> 3 times */

package mypack;

public class Simple2 {
    public void disp1() {
        System.out.println("This is Simple2");
    }

    public static void main(String args[]) {
        Simple2 ob = new Simple2();
        ob.disp1();
    }
}


//Simple3.java 


package mypack;

public class Simple3 {
    public static void main(String args[]) {
        Simple2 ob1 = new Simple2();
        ob1.disp1();
    }
}


//Simple4.java

package mypack2;

import mypack.Simple2;

public class Simple4 {
    public static void main(String args[]) {
        Simple2 ob2 = new Simple2();
        ob2.disp1();
    }
}



