package com.greatLearning.java;

import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] =new int[m][n];
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
