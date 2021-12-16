package ru.mirea.task14;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePile implements Pile {
    private Deque<Integer> deque;

    public DequePile(int[] cards) {
        deque = new ArrayDeque<>();

        for (int i = 0; i < cards.length; i++) {
            deque.addLast(cards[i]);
        }
    }

    @Override
    public void pushBack(int x) {
        deque.addLast(x);
    }

    @Override
    public int popFront() {
        return deque.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
