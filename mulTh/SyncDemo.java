
public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                Counter.increment();
            }
        });
        t1.start();
        System.out.println(t1.getPriority());
        t1.setPriority(1);
        System.out.println(t1.getPriority());

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                Counter.increment();
            }
        });
        t2.start();

        // waiting for threads to complete its execution
        t1.join();
        t2.join();


        System.out.println(Counter.count);
    }
}

class Counter {
    static int count = 0;

    // using synchronized for thread safety
    synchronized static void increment() {
        count++;
    }
}