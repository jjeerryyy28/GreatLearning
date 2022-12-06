package com.greatLearning.java.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ld = new LinkedList<>();
        System.out.println("list: "+ld);
        System.out.println(ld.peek());
        ld.add(1);
        ld.add(2);
        System.out.println("list: "+ld);
        ld.add(0,3);
        System.out.println("list: "+ld);
        ld.addFirst(1);
        System.out.println("list:"+ld);
        System.out.println(ld.offer(8));
        System.out.println("list: "+ld);
        System.out.println("polled element: "+ld.poll());
        System.out.println(ld.remove(2));






    }
}
