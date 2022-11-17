package com.greatLearning.java;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            //Taking input from user
            arr[i]=sc.nextInt();
        }
        /**first method
         *
         * Arrays.sort(arr[i]) --> inbuilt method to sort an array
         * */


        /** Second method to Sort an Array*/
        //creating and initialising temp variable for swapping
        int temp=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    /**swapping arr[i] and arr[j] if element of i is greater than j
                    and storing it in temp variable
                     */
                    temp = arr[i];
                    arr[i] = arr[j];
                    //reassigning greater value to j
                    arr[j] = temp;
                }
            }
            // printing sorted array
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
