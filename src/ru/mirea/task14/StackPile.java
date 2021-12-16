package ru.mirea.task14;

import java.util.Stack;

public class StackPile implements Pile{
    private Stack<Integer> stack;

    public StackPile(int[] cards) {
        stack = new Stack<Integer>();

        for (int i = cards.length - 1; i >= 0; i--) {
            stack.push(cards[i]);
        }
    }

    @Override
    public void pushBack(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        stack.push(x);
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    @Override
    public int popFront() {
        return stack.pop();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
