package com.greatLearning.java.codingChallenge;

import java.util.Scanner;

public class performLeftShiftOperator {
    int performleftShift(int val) {
        int digitToShift = val << 1;
        return digitToShift;
    }
    void performRightShift(int val){
        int digitToShift = val>>1;
        System.out.println(digitToShift);
    }
    public static void main(String[] args) {
        performLeftShiftOperator pf = new performLeftShiftOperator();
        System.out.println(pf.performleftShift(10));
        pf.performRightShift(10);

    }
}
