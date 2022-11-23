package com.greatLearning.java.inheritance;

class inheritanceA{
    void circleArea(){
        int r = 12;
        double areaOfCircle = 2*Math.PI*r*r;
        System.out.println(areaOfCircle);
    }
}
class inheritanceB extends inheritanceA{
    void rectangleArea(){
        int l = 10, b=10;
        int recArea = l*b;
        System.out.println(recArea);
    }
}
class inheritanceC extends inheritanceB {
    void triangleArea() {
        int l = 12;
        int b = 12;
        int triArea = 2 * l * b;
        System.out.println(triArea);

    }
}
public class Main1{
    public static void main(String[] args) {
        inheritanceC c = new inheritanceC();
        c.circleArea();
        c.rectangleArea();
        c.triangleArea();
    }
}
