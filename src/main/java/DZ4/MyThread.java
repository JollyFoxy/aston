package DZ4;

public class MyThread {

    private static final Object lock = new Object();
    private static boolean ready = true;
    private static boolean running = true;

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            while (running && !Thread.currentThread().isInterrupted()) {
                synchronized (lock) {
                    while (!ready && running) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    if (!running)
                        break;
                    System.out.println(1);
                    ready = false;
                    lock.notifyAll();
                }
            }
            System.out.println("Поток 1 завершен");
        });

        Thread thread2 = new Thread(() -> {
            while (running && !Thread.currentThread().isInterrupted()) {
                synchronized (lock) {
                    while (ready && running) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    if (!running)
                        break;
                    System.out.println(2);
                    ready = true;
                    lock.notifyAll();

                }
            }
            System.out.println("Поток 2 завершен");
        });

        thread1.start();
        thread2.start();

        // Thread.sleep(1);
        // running = false;

        // thread1.join();
        // thread2.join();
    }

}
