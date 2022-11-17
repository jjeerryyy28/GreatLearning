package com.greatLearning.java;

import java.util.Scanner;

public class PrintArrayInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
