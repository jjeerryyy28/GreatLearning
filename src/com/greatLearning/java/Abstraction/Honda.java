package com.greatLearning.java.Abstraction;

abstract class Bike{
    abstract void run();
}
public class Honda extends Bike {
    void run(){
        System.out.println("drive safely");
    }

    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
    }
}
