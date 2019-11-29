package io.turntabl.my;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class HorseRaceWorker extends Thread {
    private CyclicBarrier barrier;

    public HorseRaceWorker(String name, CyclicBarrier barrier) {
        super("Horse "+name);
        this.barrier = barrier;
    }

    @Override
    public void run() {
//        super.run();
        try{
            System.out.println(Thread.currentThread().getName() + " is ready");
            barrier.await();
            Thread.sleep((int)(Math.random() * 10000));
            System.out.println(Thread.currentThread().getName() + " finished");
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
