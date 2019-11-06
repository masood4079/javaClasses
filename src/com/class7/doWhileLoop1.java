package com.class7;

public class doWhileLoop1 {
	
	public static void main(String[] args) {
		
		// do while is similar to the while loop
		// code will execute while the condation is true
		// even if condation is false code will execute at least once
		
		int num=10;
		while (num<=7) {
			System.out.println("Hellso");
			num++;
		}
		int num1=10;
		do {
			System.out.println("bye");
			
		}while(num1<=7);
		// print even number from 20 to 50 using do while
		int even=20;
		do {
			System.out.println(even);
			even+=2;
		}while( even<=50);
		
	}

}
