package com.greatLearning.java.codingChallenge;
class Encap{
    private String country;
    private String nationalAnthem;
    private String touristSpot;

    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getNationalAnthem(){
        return nationalAnthem;
    }
    public void setNationalAnthem(String nationalAnthem){
        this.nationalAnthem = nationalAnthem;
    }
    public String getTouristSpot(){
        return touristSpot;
    }
    public void setTouristSpot(String touristSpot){
        this.touristSpot = touristSpot;
    }
}
public class CodingChallenge14 {
    public static void main(String[] args) {
        //creating object
        Encap ec = new Encap();
        //setting values using setter method
        ec.setCountry("India");
        ec.setNationalAnthem("Jana Gana Mana");
        ec.setTouristSpot("New Delhi");
        //getting values using getter method
        System.out.println("country: "+ec.getCountry()+" | National Anthem: "+ec.getNationalAnthem()+" | Tourist Spot: "+ec.getTouristSpot());
    }
}
