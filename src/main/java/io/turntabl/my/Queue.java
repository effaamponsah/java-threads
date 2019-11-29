package io.turntabl.my;

public interface Queue {
    boolean offer(int element);
    int poll();
}
