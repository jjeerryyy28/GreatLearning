package com.greatLearning.java.Encapsulation;

class studentEncaps{
    private int rollNo;
    private int age;
    private  String name;
    private float fee;
    studentEncaps(int rollNo, int age, String name, float fee){
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.fee = fee;
    }
    void display(){
        System.out.println(rollNo+" "+ age+" "+name+" "+fee);
    }
}
public class TestThis {
    public static void main(String[] args) {
        studentEncaps s1 = new studentEncaps(11,22,"Virat",2_30_000);
        studentEncaps s2 = new studentEncaps(07, 21, "Mahi", 2_40_000);
        s1.display();
        s2.display();
    }
}
