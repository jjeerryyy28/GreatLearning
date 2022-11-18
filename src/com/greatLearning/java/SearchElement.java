package com.greatLearning.java;

import java.util.Scanner;

public class SearchElement {
    public static boolean searchElement(int[] arr, int n, int key) {
        int i = 0; //initialising index i from start
        int j=n-1; //initialising index j from end
        while(i<j){ //checking if index i is less than j then this loop with continue else it will terminate
            if(arr[i]==key){
                //if we found key at array index i it will return true else it will move to next condition
                return true;
            }
            //if key is greater than index element, index i will increment(post increment)
            else if(arr[i]<key) {
                i++;
            }
            else {
                j--;
            }
        }
        //if we didnt find our key it will return as false
        return  false;
    }
    public static void main(String[] args) {

        //Using two pointer approach*
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        //taking elements through user
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = scanner.nextInt();
        }
//        System.out.print(arr[i]);
        System.out.print("\nEnter key to search: ");
        int key = scanner.nextInt(); //taking key from user to find in an array
        scanner.close();
        System.out.println(searchElement(arr, n, key));


    }



}
