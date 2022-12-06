package com.greatLearning.java.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            st.add(sc.nextInt());
        }
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        st.push(1);
        System.out.println(st.peek());
        System.out.println("pop element: "+st.pop());
        System.out.println(st.search(10));
        System.out.println(st.search(2));
    }
}
