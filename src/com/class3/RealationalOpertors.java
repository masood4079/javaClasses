package com.class3;

public class RealationalOpertors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=20;
		int num2=19;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("***************************");
		
		double d=1.99;
		double d1=2.99;
		boolean b5=d>d1;
		System.out.println(b5);// false
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//true
		int a=10;
		int b=30;
		// if number a is bigger than number b
		 // i want to print a is bigger than b
		
		if (a>b) {
			System.out.println("a is larger than b");
		}
		else
		{System.out.println("a is smaller than b");
		}
		int expectedHours=15;
		int actualHours=2;
		
		if(actualHours>expectedHours)
		{
			System.out.println("you will succeed");
			
		}else {
			System.out.println("please study more");
		 

	}
		
		double teaPrice=2.99;
		double allowedPrice=3.99;
		if(allowedPrice>=teaPrice) {
			System.out.println("i will buy tea");
			
		}else {
			System.out.println("i canntot afford, i need more ");}
			System.out.println("I will go back to studay ");
		}
		}


