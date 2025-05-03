public class Demo1 {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("From t2 thread: " + i);
            }
        });

        t2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("From Main: " + i);
        }
    }
}


class ThreadDemo extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("From ThreadDemo : " + i);
        }
    }
}