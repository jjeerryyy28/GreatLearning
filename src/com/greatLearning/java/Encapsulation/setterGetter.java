package com.greatLearning.java.Encapsulation;
 class Bank{
     private long AccNo;
     private String name;
     private double amount;

     public long getAccNo(){
         return AccNo;
     }
     public void setAccNo(long AccNo){
         this.AccNo = AccNo;
     }
     public String getName(){
         return  name;
     }
     public void setName(String name){
         this.name = name;
     }
     public double getAmount(){
         return amount;
     }
     public void setAmount(double amount){
         this.amount = amount;
     }
 }

public class setterGetter {
    public static void main(String[] args) {
        Bank obj = new Bank();
        //setting values using setter method
        obj.setName("Prajwal");
        obj.setAccNo(9734873L);
        obj.setAmount(45_00_000);
        //getting values using getter method
        System.out.println(obj.getName()+" "+obj.getAccNo()+" "+obj.getAmount());
    }
}
