/* 1) Write a small program in Java where you handle another in-built exception of your choice.
 2) Include user input; this should create exception.
 3) Print the exception message to show that the exception is caught.
 4) Identify the exception handling keywords used and why
 5) Create a customised exception for the same code. */

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int arraySize = scanner.nextInt();

            // Check if the array size is negative or zero
            if (arraySize < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative");
            } else if (arraySize == 0) {
                throw new InvalidArraySizeException("Array size cannot be zero");
            }

            int[] array = new int[arraySize];

            System.out.println("Array created with size: " + arraySize);
        } catch (NegativeArraySizeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (InvalidArraySizeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}

// Custom exception class for invalid array size scenario (size = 0)
class InvalidArraySizeException extends Exception {
    public InvalidArraySizeException(String message) {
        super(message);
    }
}
