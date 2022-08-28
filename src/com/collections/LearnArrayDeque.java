package com.collections;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrDeq = new ArrayDeque<>();
        arrDeq.offer(10);
        arrDeq.offer(20);
        arrDeq.offerFirst(5);  //add element at first position of queue
        arrDeq.offer(30);
        arrDeq.offerLast(60);  //Add element at last position of queue
        arrDeq.offer(50);
        System.out.println(arrDeq);

        System.out.println("peek() "+ arrDeq.peek());
        System.out.println("peekFirst() "+ arrDeq.peekFirst());
        System.out.println("peekLast() "+arrDeq.peekLast());

        System.out.println("poll() " +arrDeq.poll());
        System.out.println("pollFirst() "+ arrDeq.pollFirst());
        System.out.println("pollLast() "+ arrDeq.pollLast());

        System.out.println(arrDeq.contains(6));  //contains() to check element present or not
        arrDeq.clear();   //clear() used to clear all elements of queue
        System.out.println(arrDeq);
    }

}
