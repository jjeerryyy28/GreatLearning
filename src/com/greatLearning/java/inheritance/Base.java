package com.greatLearning.java.inheritance;

public class Base {
    void method1(){
        System.out.println("Inside method 1");
    }
}
class Child extends Base{
    void method2(){
        System.out.println("inside method 2");
    }
}
class Main{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.method1();
        ch.method2();
    }
}