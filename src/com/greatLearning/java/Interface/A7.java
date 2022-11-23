package com.greatLearning.java.Interface;

interface printableA7{
    void print();
}
interface showableA7{
    void show();
}
public class A7 implements printableA7, showableA7{
    @Override
    public void print() {
        System.out.println("Welcome to my coding world");
    }

    @Override
    public void show() {
        System.out.println("Hello from Prajwal");
    }
}
class Main{
    public static void main(String[] args) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
