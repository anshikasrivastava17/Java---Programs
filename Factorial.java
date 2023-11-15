/* 1)Write a JAVA program to calculate the factorial of an integer. 
2) Take user input as "Enter the integer".
3) Create a function for calculating factorial.
4) Display the result using the statement "The factorial of  ____ is _____".
5) Check for factorial of 0 as well.  */


import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the integer");
        n = sc.nextInt();
        int f = Fact(n);
        System.out.println("The factorial of " + n + " is " + f);
    }

    public static int Fact(int n) {
        int f = 1;
        if (n == 0)
            return f;
        else {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
        }
        return f;
    }
}
