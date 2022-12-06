package com.greatLearning.java.polymorphism;

class compileTimePolymorphism {
    //method with two parameters
    static int addNumbers(int a, int b){
        int ans = a+b;
        return ans;
    }
    //method name same but with different parameters
    static double addNumbers(double a, float b){
        return (a+b);
    }
}
class Main{
    public static void main(String[] args) {
        compileTimePolymorphism ct = new compileTimePolymorphism();
        System.out.println(ct.addNumbers(8,1));
        System.out.println(ct.addNumbers(9.9, 6));

    }
}
