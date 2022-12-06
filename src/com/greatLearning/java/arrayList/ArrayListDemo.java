package com.greatLearning.java.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("list1: "+list1+"\n"+"list: "+list);
        list1.add(3);
        list.add(4);
        System.out.println("list1: "+list1+"\n"+"list: "+list);
        list1.add(0,1);
        list.add(0,2);
        System.out.println("list1: "+list1+"\n"+"list: "+list);
        list.set(0,11);
        list1.remove(1);
        System.out.println("list1: "+list1+"\n"+"list: "+list);
        System.out.println("Element at 3rd index: "+list.get(0));




    }
}
