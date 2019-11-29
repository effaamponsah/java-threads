package io.turntabl.my;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Collection {
    public static void main(String[] args) {
         List<Thread> threads= Arrays.asList(
                new Thread(() -> {
                  if(Thread.interrupted())
                      System.out.println("T1 is interupted");
                }),
                new Thread(() -> {
                    if(Thread.interrupted())
                        System.out.println("T2 is interrupted");
                }),
                new Thread(() -> {
                    if (Thread.interrupted())
                        System.out.println("T3 is interrupted");
                }),
                new Thread(() -> {
                    if (Thread.interrupted())
                        System.out.println("T4 is interrupted");
                }),
                new Thread(() -> {
                    if (Thread.interrupted())
                        System.out.println("T5 is interrupted");
                }),
                new Thread(() -> {
                    if (Thread.interrupted())
                        System.out.println("T6 is interrupted");
                })
        );
        Stream<Thread> threadStream = threads.stream();

//        System.out.println("Main process");
//        main process
//        threadStream.map(thread -> thread.in);


    }
}
