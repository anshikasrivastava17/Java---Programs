import java.util.Scanner;

public class CRC {

    // XOR operation function
    public static String XOR(String databits, String polynomial) {
        StringBuilder result = new StringBuilder();
        int n = polynomial.length();

        // Perform XOR between databits and polynomial
        for (int i = 0; i < n; i++) {
            if (databits.charAt(i) == polynomial.charAt(i))
                result.append('0');
            else
                result.append('1');
        }

        System.out.println("XOR result: " + result);

        // Remove leading zeros from the result
        StringBuilder newresult = new StringBuilder(); // Changed to StringBuilder
        int i = 0;
        while (i < n && result.charAt(i) == '0') {
            i++;
        }
        while (i < n) {
            newresult.append(result.charAt(i)); // Using append method
            i++;
        }

        System.out.println("XOR new result: " + newresult);
        return newresult.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello");

        System.out.print("Enter the data stream: ");
        String databits = scanner.nextLine();

        System.out.print("Enter the polynomial: ");
        String polynomial = scanner.nextLine();

        int m = databits.length();
        int n = polynomial.length();

        String augmentedData = databits + "0".repeat(n - 1); // Append (n-1) zeros to databits
        String newresult = XOR(augmentedData, polynomial); // XOR first n bits FIRST DIVISION

        // Perform XOR division to calculate the remainder
        for (int i = n; i < m + n - 1;) { // from n because first n bits already done
            // Add bits to the remainder until it matches the size of the polynomial
            while (newresult.length() < n && i < m + n - 1) {
                newresult += augmentedData.charAt(i); // Changed to append
                i++;
            }

            System.out.println("XOR new result after adding bits: " + newresult);

            // Perform XOR division if the newresult size is at least polynomial size
            if (newresult.length() >= n) {
                newresult = XOR(newresult, polynomial);
            }
        }

        // remainder = redundant CRC bits to be appended to original data
        StringBuilder codeword = new StringBuilder(databits);
        System.out.println("Final remainder: " + newresult);

        int crcBitLength = n - 1; // Degree of polynomial
        for (int i = 0; i < crcBitLength - newresult.length(); i++) {
            codeword.append('0');
        }

        // Form the transmitted codeword (original data + remainder)
        codeword.append(newresult);
        System.out.println("Transmitted data with CRC (codeword): " + codeword);

        System.out.println("-------for receiver's side ------");

        // receiver checking the codeword
        String receivedCodeword = codeword.toString();
        String checkResult = XOR(receivedCodeword, polynomial);

        // Perform XOR division on received codeword
        for (int i = n; i < m + n - 1;) {
            while (checkResult.length() < n && i < m + n - 1) {
                checkResult += receivedCodeword.charAt(i);
                i++;
            }

            System.out.println("Receiver XOR new result after adding bits: " + checkResult);

            if (checkResult.length() >= n)
                checkResult = XOR(checkResult, polynomial);
        }

        System.out.println("check result is " + checkResult);
        // Check if the remainder is all zeroes
        if (checkResult.equals("0"))
            System.out.println("No errors detected in the received data!");
        else
            System.out.println("Error detected in the received data!");
    }
}
