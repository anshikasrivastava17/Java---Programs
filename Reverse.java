/*1) Use a random number generating function
2) Use a random string generating function
3) Convert integer to string (take input from 1. ) 
4) Convert integer to float
5) Convert string to double (take input from 2. )
6) WAP to reverse a string using reverse( )
7) WAP to reverse same string without using reverse( ). You may use other functions */

import java.util.Random;

public class Reverse {
    // Task 1: Use a random number generator
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // Task 2: Use a random string generator function
    public static String generateRandomString(int length) {
        String characters = "0123456789";
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = generateRandomNumber(0, characters.length() - 1);
            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }

    public static void main(String[] args) {
        // Generate random inputs for tasks 3 to 7
        int integerValue = generateRandomNumber(100, 1000);
        String doubleString = generateRandomString(5);
        System.out.println("random values generated are " + integerValue + " and " + doubleString);
        // Task 3: Convert integer to string
        String stringValue = String.valueOf(integerValue);
        System.out.println("Integer to String: " + stringValue);

        // Task 4: Convert integer to float
        float floatValue = (float) integerValue;
        System.out.println("Integer to Float: " + floatValue);

        // Task 5: Convert string to double
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("String to Double: " + doubleValue);

        // Task 6: Reverse a string using reverse()
        StringBuilder reversedString = new StringBuilder(doubleString).reverse();
        System.out.println("Reversed String using reverse(): " + reversedString);

        // Task 7: Reverse a string without using reverse() function
        char[] charArray = doubleString.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        String reversedStringWithoutReverse = new String(charArray);
        System.out.println("Reversed String without reverse(): " + reversedStringWithoutReverse);
    }
}
