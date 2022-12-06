package com.greatLearning.java.codingChallenge;

import java.util.Scanner;

public class linearSearch {
    public int n, key;
    public int num[];
    public boolean stats = false;
    Scanner sc = new Scanner(System.in);
    public void implementation(){
        System.out.println("Enter how many elements you want to store in an array");
        n = sc.nextInt();
        num = new int[n];

        System.out.println("Enter elements now: ");
        insertValues();
        printValues();

        System.out.println("Enter key to search: ");
        key = sc.nextInt();
        searchValues();
    }
    public void searchValues(){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                System.out.println("Key value "+key+" found at index "+i);
                stats = true;
            }
        }
        if(stats==false){
            System.out.println("Value not found!!!");
        }
    }
    public void insertValues() {
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
    }
    public void printValues(){
        for(int i=0;i<n;i++){
            System.out.println("Value of position "+i+ " is " + +num[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linearSearch ls = new linearSearch();
        ls.implementation();
    }

}
