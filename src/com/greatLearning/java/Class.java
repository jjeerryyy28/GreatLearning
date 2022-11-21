/**
 Create a class
 Copy and paste the below code in class.
 Create a main method in the class.
 Create an object “obj” for the class in the main method.
 Execute the copyMe() method using the object created.
*/

package com.greatLearning.java;

public class Class {
    void copyMe(){
        System.out.println("inside copy me method");
    }

    public static void main(String[] args) {
        Class obj = new Class();
        obj.copyMe();
    }
}
