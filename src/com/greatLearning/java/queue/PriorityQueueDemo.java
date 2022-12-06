package com.greatLearning.java.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        System.out.println(queue);
        queue.add("mohan");
        queue.add("Prajwal");
        queue.add("salman");
        queue.add("Aish");
        System.out.println(queue);
        System.out.println("head of queue"+queue.element());
        System.out.println("head of queue"+queue.peek());

        Iterator itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
