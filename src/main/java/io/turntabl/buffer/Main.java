package io.turntabl.buffer;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];

        CircularBuffer buffer = new CircularBuffer(array);

        Producer producer = new Producer (buffer);
        Consumer consumer = new Consumer (buffer);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.err.println("Error with Threads");
            e.printStackTrace();
        }

    }
}