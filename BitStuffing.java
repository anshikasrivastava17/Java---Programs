import java.util.Scanner;

public class BitStuffing {

    // bit stuffing
    public static int[] stuffing(int[] input, int inputSize) {
        int[] output = new int[200];
        int outputSize = 0;
        int consecutiveOnes = 0;

        for (int i = 0; i < inputSize; i++) {
            output[outputSize++] = input[i];
            if (input[i] == 1)
                consecutiveOnes++;
            else
                consecutiveOnes = 0;

            if (consecutiveOnes == 5) {
                output[outputSize++] = 0; // Stuff a 0 after 5 consecutive 1's
                consecutiveOnes = 0;
            }
        }

        System.out.print("Stuffed data: ");
        for (int i = 0; i < outputSize; i++)
            System.out.print(output[i]);

        System.out.println();

        return trimArray(output, outputSize);
    }

    public static void destuffing(int[] stuffedData, int stuffedSize) {
        int[] destuffed = new int[200];
        int destuffedSize = 0;
        int consecutiveOnes = 0;

        for (int i = 0; i < stuffedSize; i++) {
            destuffed[destuffedSize++] = stuffedData[i]; // Add the current bit to the destuffed array

            if (stuffedData[i] == 1)
                consecutiveOnes++;
            else
                consecutiveOnes = 0;

            if (consecutiveOnes == 5) {
                i++; // Skip stuffed 0
                consecutiveOnes = 0; // Reset consecutive ones counter
            }
        }

        System.out.print("Destuffed data: ");
        for (int i = 0; i < destuffedSize; i++)
            System.out.print(destuffed[i]);
        System.out.println();
    }

    private static int[] trimArray(int[] array, int size) {
        int[] trimmedArray = new int[size];
        for (int i = 0; i < size; i++)
            trimmedArray[i] = array[i];
        return trimmedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements:");
        String inputString = scanner.next();
        int[] input = new int[inputString.length()];
        int inputSize = 0;

        // Convert string into an array of integers
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == '1' || ch == '0')
                input[inputSize++] = ch - '0'; // Converting char to integer
        }

        int[] stuffedData = stuffing(input, inputSize);
        destuffing(stuffedData, stuffedData.length);
    }
}