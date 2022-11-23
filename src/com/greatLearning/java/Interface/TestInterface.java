package com.greatLearning.java.Interface;

interface print{
    void print();
}
interface show{
    void print();
}
public class TestInterface implements print, show{
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        TestInterface TI = new TestInterface();
        TI.print();
    }
}
