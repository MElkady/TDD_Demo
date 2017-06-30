package me.elkady;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public T pop() {
        return list.removeFirst();
    }

    public void push(T s1) {
        list.addFirst(s1);
    }

    public T peek() {
        return list.peekFirst();
    }


}