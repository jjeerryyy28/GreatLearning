package com.greatLearning.java;

public class Bike1 {
    /**
     * default constructor :
    Bike1(){
        System.out.println("Bike is Hero");
    }

    public static void main(String[] args) {
        Bike1 b = new Bike1();
        System.out.println(b);
    }
}
*/

    //parameterized constructor:
    String name;
    String mileage;
    Bike1(){
        name="Hero-Honda";
        mileage = "34kmpl";
    }

    Bike1(String N, String M){
        name = N;
        mileage = M;
    }
    void display(){
        String BikeNameAndMileage;
        BikeNameAndMileage = name + " is giving mileage of " + mileage;
        System.out.println(BikeNameAndMileage);
    }

    public static void main(String[] args) {
        Bike1 bike = new Bike1();
        Bike1 bike2 = new Bike1("KTM","45KMPL");
        bike2.display();
        bike.display();


    }
}