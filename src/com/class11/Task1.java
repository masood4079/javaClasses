package com.class11;

public class Task1 {
	public static void main(String[]args) {
		 // /*Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
 // an array on integers and calculate the sum of all elements in an array.
  //an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
		
		//first way
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Opel", "Mercedes"};
		
		for (String i : cars) {
		System.out.println(i);
		}
		//Second way
		System.out.println("------------------");
		 for(int i=0; i<cars.length;i++) {
	            
	            System.out.println(cars[i]);
	}

}
}
