package ru.mirea.task14;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueuePile implements Pile {
    private Queue<Integer> queue;

    public QueuePile(int[] cards) {
        queue = new LinkedList<Integer>();

        for (int i = 0; i < cards.length; i++) {
            pushBack(cards[i]);
        }
    }

    @Override
    public void pushBack(int x) {
        queue.add(x);
    }

    @Override
    public int popFront() {
        return queue.remove();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

//    public void print() {
//        Object[] array = queue.toArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.print((int) array[i]);
//            System.out.print(" ");
//        }
//        System.out.println();
//    }
}
