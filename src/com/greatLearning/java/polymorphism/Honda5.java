package com.greatLearning.java.polymorphism;

class Bike {
    int speedLimit = 100;
}
public class Honda5 extends Bike{
    int speedLimit = 160;
    void run(){
        System.out.println("Car is running at 80kmph");
    }

    public static void main(String[] args) {
        Bike obj = new Honda5();
        System.out.println(obj); //it will print identity hashmap
        System.out.println(obj.speedLimit);
        ((Honda5) obj).run();
    }
}

