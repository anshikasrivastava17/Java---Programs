import java.util.Scanner;

public class HammingCode {

    static int calculateParityBits(int m) {
        int r = 0;
        while (Math.pow(2, r) < (m + r + 1)) {
            r++;
        }
        return r;
    }

    static int[] generateHammingCode(int[] dataBits) {
        int m = dataBits.length;
        int r = calculateParityBits(m);
        int totalLength = m + r;

        int[] hammingCode = new int[totalLength];
        int dataIndex = 0;

        for (int i = 0; i < totalLength; i++) {
            if ((i & (i + 1)) == 0) {
                hammingCode[i] = -1;
            } else {
                hammingCode[i] = dataBits[dataIndex++];
            }
        }

        // Calculate parity bits
        for (int i = 0; i < r; i++) {
            int parityPos = (int) Math.pow(2, i) - 1;
            int parity = 0;

            for (int j = parityPos; j < totalLength; j += (parityPos + 1) * 2) {
                for (int k = j; k < j + parityPos + 1 && k < totalLength; k++) {
                    if (hammingCode[k] != -1) {
                        parity ^= hammingCode[k];
                    }
                }
            }

            hammingCode[parityPos] = parity;
        }

        return hammingCode;
    }

    static int detectError(int[] hammingCode) {
        int totalLength = hammingCode.length;
        int r = (int) (Math.log(totalLength) / Math.log(2)) + 1;
        int errorPosition = 0;

        for (int i = 0; i < r; i++) {
            int parityPos = (int) Math.pow(2, i) - 1;
            int parity = 0;

            for (int j = parityPos; j < totalLength; j += (parityPos + 1) * 2) {
                for (int k = j; k < j + parityPos + 1 && k < totalLength; k++) {
                    parity ^= hammingCode[k];
                }
            }

            if (parity != 0)
                errorPosition += (parityPos + 1);
        }

        return errorPosition;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of data bits:");
        int m = scanner.nextInt();

        int[] dataBits = new int[m];
        System.out.println("Enter the data bits one by one:");
        for (int i = 0; i < m; i++)
            dataBits[i] = scanner.nextInt();

        int[] hammingCode = generateHammingCode(dataBits);

        System.out.println("Generated Hamming Code with Even Parity: ");
        for (int bit : hammingCode)
            System.out.print(bit + " ");

        System.out.println();

        System.out.println("Enter the received Hamming code bits one by one (introduce an error if desired):");
        int[] receivedCode = new int[hammingCode.length];
        for (int i = 0; i < hammingCode.length; i++)
            receivedCode[i] = scanner.nextInt();

        int errorPosition = detectError(receivedCode);
        if (errorPosition == 0)
            System.out.println("No errors detected.");
        else {
            System.out.println("Error detected at position: " + errorPosition);
            System.out.println("Correcting the error...");
            receivedCode[errorPosition - 1] ^= 1;

            System.out.println("Corrected Hamming Code: ");
            for (int bit : receivedCode)
                System.out.print(bit + " ");
        }
    }
}