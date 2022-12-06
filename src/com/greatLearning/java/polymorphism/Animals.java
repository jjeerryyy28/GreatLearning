package com.greatLearning.java.polymorphism;

class Dog{
    public void bark(){
        System.out.println("Dogs can Bark");
    }
}
class Cat extends Dog{
    public void bark(){
        System.out.println("cats cannot bark");
    }
}
class Dog2 extends Cat{
    public void bark(){
        System.out.println("Dogs can also howl");
    }
}
public class Animals {
    public static void main(String[] args) {
        Dog A = new Dog();
        Cat B = new Cat();
        Dog C = new Dog2();
        A.bark();
        B.bark();
        C.bark();
    }
}
