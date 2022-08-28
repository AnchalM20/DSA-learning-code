package com.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(); //It works like a MinHeap(root is smallest)
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);
        pq.offer(60);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());  //return top value(root)

        Queue<Integer> prQue = new PriorityQueue<>(Comparator.reverseOrder());  //It works like a MaxHeap(root value is largest)
        prQue.offer(6);
        prQue.offer(10);
        prQue.offer(15);
        prQue.offer(20);
        System.out.println(prQue);
    }
}
