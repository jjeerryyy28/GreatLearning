package com.greatLearning.java;

class Recursion{
    int function (int n){
        int result;
        if (n ==0)  { return n++; }
        result = function (n - 1);
        return result;
    }
}
class RecursionImplementation{
    public static void main(String args[]){
        Recursion obj = new Recursion() ;
        System.out.print(obj.function(12));
    }
}
