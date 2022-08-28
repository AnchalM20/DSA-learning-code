package com.collections;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(100);         // offer() to add elements in the queue
        queue.offer(200);
        queue.offer(300);
        queue.offer(400);
        queue.offer(500);
        queue.offer(600);
        System.out.println(queue);

        System.out.println(queue.poll());  //poll() to remove element from queue
        System.out.println(queue);
        queue.add(2000);                //add() to add element at rear-end but throw exception
        System.out.println(queue);

        System.out.println(queue.element());
    }
}
