package com.class7Review;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MagicDollar 
		    // $$$$$
		    // $   $
		    // $   $
		    // $$$$$
		    
		        
		        for (int i = 1; i <= 4; i++) {
		            for (int j = 1; j <= 5; j++) {
		                if (i == 1 || j == 1 || i == 4 || j == 5) {
		                    System.out.print("$");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
}

	