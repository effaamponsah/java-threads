package io.turntabl.my;

import io.turntabl.execution.barriers.BarrierWorker;

import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class HorseRace {
    public static void main(String[] args) {
         int numberOfHorses=3;

        CyclicBarrier barrier = new CyclicBarrier(numberOfHorses,
                ()-> System.out.println("finish line reached"));

        IntStream.range(0, numberOfHorses).forEach(i->
                new HorseRaceWorker(String.valueOf(i), barrier).start()
        );


    }
}
