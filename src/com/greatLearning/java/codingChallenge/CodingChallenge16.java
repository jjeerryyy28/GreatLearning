package com.greatLearning.java.codingChallenge;

public class CodingChallenge16 {
    void divide(int a, int b){
        int ans = a/b;
        System.out.println(ans);
    }
    void divide(){
        System.out.println("Method with no arguments");
    }
    String name(String s1){
        System.out.println("I am from method without return type and an input argument");
        return s1;
    }
    String name(){
        String s1 = "I am from method with return type";
        return s1;
    }
    void diplay(){
        System.out.println(name());
        System.out.println(name("Prajwal"));
    }

    public static void main(String[] args) {
        CodingChallenge16 cd = new CodingChallenge16();
        cd.divide();
        cd.divide(16,2);
        cd.diplay();
    }
    
}
