package com.greatLearning.java.linearSearch;

import java.util.Scanner;


public class linearSearchOperation {
    public static int SearchElement(int num[], int key, int n){
        for(int i=0;i<n;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int num[]= {1,2,23,432,231,21};
        int n = num.length;
        int pos = SearchElement(num, key, n);
        if(pos==-1){
            System.out.println("ELement is not present in an array");
        }
        else{
            System.out.println("Element found at index: "+pos);
        }
    }
}
