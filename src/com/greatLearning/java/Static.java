package com.greatLearning.java;

public class Static {
    public int var1 = 10;
    public static int var2 = 10;

    void method1(){
        var1++;
        System.out.println(var1);
    }
    void method2(){
        var2++;
        System.out.println(var2);
    }

    public static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();

        System.out.println("Using non static keyword");
        obj1.method1();
        obj2.method1();
        obj3.method1();

        System.out.println("<------------------------------------------>");
        System.out.println("Using static keyword");
        obj1.method2();
        obj2.method2();
        obj3.method2();
    }
}
