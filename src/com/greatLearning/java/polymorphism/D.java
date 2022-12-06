package com.greatLearning.java.polymorphism;

class A{
    void eat(){
        System.out.println("Animals eat");
    }
}
class B extends A{
    void eat(){
        System.out.println("Herbivores eat plants");
    }
}
class C extends A{
    void eat(){
        System.out.println("Omnivores eat plants and flesh");
    }
}
public class D {
    public static void main(String[] args) {

        A obj = new A();
        A obj1 = new B();
        A obj2 = new C();
        obj.eat();
        obj1.eat();
        obj2.eat();
    }
}
