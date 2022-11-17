package com.greatLearning.java;

public class DynamicArrayDemo {
    int[] arr;
    int size;
    int capacity;

    DynamicArrayDemo(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size=0;
    }
    void insert(int element){
        if(size==capacity){
            growArray();
        }
        arr[size++] = element;
    }
    void growArray(){
        int tempArr[] = new int[2*size];
        for(int i=0;i<size;i++)
            tempArr[i] = arr[i];

        arr = tempArr;
        capacity = 2*size;
    }
    int delete(int index){
        if(index>=size){
            return -1;
        }
        int deleteEle = arr[index];
        for(int i=index+1;i<size;i++){
            arr[i-1]=arr[i];
        }
        size--;
        return deleteEle;
    }
    void display(){
        System.out.println("Array with size");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array with capacity");
        for(int i=0;i<capacity;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicArrayDemo demo = new DynamicArrayDemo(3);
        demo.insert(12);
        demo.insert(13);
        demo.insert(14);
        demo.insert(15);
        demo.insert(16);
        demo.insert(17);

        System.out.println("Deleted Element: " + demo.delete(2));
        demo.display();
    }
}
