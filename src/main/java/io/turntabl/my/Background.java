package io.turntabl.my;

public class Background {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("This is thread 1");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("This is thread 2");
        });

        t1.setDaemon(true);
        t2.setDaemon(true);

        Thread.sleep(10000);
        t1.start();
        t2.start();
        System.out.println("Main process");
        t1.join();
        t2.join();
    }
}
