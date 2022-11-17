package com.greatLearning.java;

public class StaticKeywordImplementation {
    static int num = 5;
    static int count = 0;
    StaticKeywordImplementation(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
//        while (count-- > 0) {
//            checkStatic();
//
//        }


//        public static  void checkStatic(){
//            count++;
            StaticKeywordImplementation st = new StaticKeywordImplementation();
            StaticKeywordImplementation st1 = new StaticKeywordImplementation();
            StaticKeywordImplementation st2 = new StaticKeywordImplementation();
//            num++;
//            System.out.print(" "+num);
//            System.out.println(" "+count);

        }
    }

