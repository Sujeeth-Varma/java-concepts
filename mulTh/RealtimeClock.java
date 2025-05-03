import java.time.LocalTime;

public class RealtimeClock {
    public static void main(String[] args) {
        Thread clock = new Thread(new Clock());
        clock.setDaemon(true); // it stops when main exits
        clock.start();

        try {
            Thread.sleep(10000); // lets clock run for 10s
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Clock Stopped!");
    }
}

class Clock implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Current Time : " + LocalTime.now());
            try {
                // 1000ms = 1s
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
