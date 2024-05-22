/* WAP in java to implement the PingPong program using thread class extension.
Print as follows:
a)	Ping: 1/20th of a second
b)	Pong: 1/40th of a second */

public class PingThread extends Thread {
    private String word; // what word to print
    private int delay; // how long to pause

    public PingPong(String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
    }

    public void run() {
        try {
            for (;;) {
                System.out.print(word + " ");
                Thread.sleep(delay); // wait until next time
            }
        } catch (InterruptedException e) {
            return; // end this thread
        }
    }

    public static void main(String[] args) {
        new PingPong("ping", 50).start(); // 1/20 second
        new PingPong("PONG", 100).start(); // 1/40 second
    }
}
