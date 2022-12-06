package com.greatLearning.java.codingChallenge;

class A{
    void car(){
        System.out.println("I am method A");
    }
}

class B extends A{
    void car(){
        System.out.println("I am method B");
    }
}

public class CodingChallenge12 {
    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new B();
        obj.car();
        obj1.car();
    }
}
