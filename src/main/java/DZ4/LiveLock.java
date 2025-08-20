package DZ4;

public class LiveLock {
    private static Object lockRes = new Object();
    private static boolean isBusy = true;

    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                while (isBusy) {
                    synchronized (lockRes) {
                        System.out.println(Thread.currentThread().getName() + " уступает ресурс");
                        Thread.yield();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " Занимает ресурс");
                synchronized (lockRes) {
                    isBusy = true;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                    isBusy = false;

                }
            }
        };

        new Thread(run, "Thread 1").start();
        new Thread(run, "Thread 2").start();

    }
}
