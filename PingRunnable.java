/* 1)WAP in java to implement the ping pong program using runnable interface 
   2) In one second , approximately print 
   a)2 ping 
   b)1 pong  */

public class PingRunnable implements Runnable {
    private String word;          // what word to print
    private long delay;           // how long to pause

    public PingPong2(String whatToSay, long delayTime) {
        word = whatToSay;
        delay = delayTime;
    }

    public void run() {
        try {
            while (true) {
                System.out.print(word + " ");
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            return; // end this thread
        }
    }

    public static void main(String[] args) {
        // Calculate the delay times to achieve the desired print frequency
        long pingDelay = 500; // 500 milliseconds (1/2 second) for approximately 2 pings per second
        long pongDelay = 1000; // 1000 milliseconds (1 second) for approximately 1 pong per second

        // Create instances of the PingPong2 class with the calculated delays
        Runnable pingRunnable = new PingPong2("ping", pingDelay);
        Runnable pongRunnable = new PingPong2("pong", pongDelay);

        // Create threads using the runnables
        Thread pingThread = new Thread(pingRunnable);
        Thread pongThread = new Thread(pongRunnable);

        // Start the threads
        pingThread.start();
        pongThread.start();
    }
}


