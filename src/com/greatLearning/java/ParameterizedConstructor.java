package com.greatLearning.java;

import java.util.Scanner;

public class ParameterizedConstructor {
    ParameterizedConstructor(String penName, int penPrice){
        ParameterizedConstructor pen = new ParameterizedConstructor("Elkos",05);

        System.out.println("Name of pen is: "+penName);
        System.out.println("Price of pen in: "+penPrice);
    }
}
