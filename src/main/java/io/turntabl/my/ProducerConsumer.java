package io.turntabl.my;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    private List<Integer> init = Arrays.asList();
    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10,true, init);

    public  boolean  producer(int element) {
      return queue.offer(element);
    }

    public int offer() {
        return queue.poll();
    }

    public static void main(String[] args) {
        ProducerConsumer p = new ProducerConsumer();
        p.producer(4);

        System.out.println(p.offer());
    }
}
