package com.class7Review;

import java.util.Scanner;

public class Task77 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	       int[] arr = new int[5];
	       for (int i=0;i<arr.length;i++)
	       {
	           arr[i] = input.nextInt();
	       }
	       for (int i=arr.length-1;i>=0;i--)
	       {
	           System.out.println(arr[i]);
	       }
	   }
	}
