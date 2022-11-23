package com.greatLearning.java.Abstraction;

abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest() {
        return 11;
    }
}
class PNB extends Bank{
    int getRateOfInterest() {
        return 12;
    }
}
public class Main2 {
    public static void main(String[] args) {

        Bank b = new SBI();
        Bank b1 = new PNB();
        int interest = b1.getRateOfInterest();
        System.out.println("Rate of interest is "+interest+"%");
    }

}
