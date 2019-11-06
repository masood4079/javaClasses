package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
String[] country= {"Germany", "USA", "Canada", "Turkey"};
        
        for(String c:country) {
            switch(c) {
            case "Germany":
                System.out.println("Berlin");
                break;
            case "USA":
                System.out.println("Washington DC");
                break;
            case "Canada":
                System.out.println("Ottowa");
                break;
            case "Turkey":
                System.out.println("Ankara");
                break;
            }
            System.out.println("-------------");
            String[] capitals= {“USA”,“Morocco”, “France”, “Italy”};
            
            for(String b:capitals) {
                if(b.equals(“France”)) {
                    System.out.println(“The capital of France is Paris”);
                }if(b.equals(“USA”)) {
                    System.out.println(“The capital of USA is DC”);
                if(b.equals(“Morocco”)) {
                    System.out.println(“The capital of Morocco is Rabat”);
                if(b.equals(“Italy”)) {
                    System.out.println(“The capital of Italy is Milano”);
                
            }
                
        }
	

}
