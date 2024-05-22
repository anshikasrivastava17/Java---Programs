/* 1)WAP in Java to generate two threads, one for printing even number and other for printing odd number.
2) The two threads should be synchronized. 
3) Put an ending condition of your choice two threads 
4) First even numbers should be printed and then odd numbers should be printed */

public class EveOdd extends Thread {
    private static final int MAX_COUNT = 20;
    private static final Object lock = new Object();

    public void printEven() {
        synchronized (lock) {
            System.out.println("\nEVEN NUMBERS:");
            for (int i = 2; i <= MAX_COUNT; i += 2) {
                System.out.print(i + " ");
            }
        }
    }

    public void printOdd() {
        synchronized (lock) {
            System.out.println("\nODD NUMBERS:");
            for (int i = 1; i <= MAX_COUNT; i += 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        EveOdd printer = new EveOdd();

        // Create two threads
        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        // Start the threads

        evenThread.start();
        oddThread.start();
    }
}
