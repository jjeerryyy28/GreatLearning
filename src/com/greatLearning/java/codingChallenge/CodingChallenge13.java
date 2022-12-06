package com.greatLearning.java.codingChallenge;

class Polymorphism{
    public int findArea(int x, int y){
        return x*y;
    }
    public int findArea(int l, int b, int h){
        return (2*l+2*b+2*h);
    }
}

public class CodingChallenge13 {
    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        System.out.println(poly.findArea(12,13));
        System.out.println(poly.findArea(12,12,12));
    }
}
