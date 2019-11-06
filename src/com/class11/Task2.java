package com.class11;

public class Task2 {

	public static void main(String[] args) {
		// an array on integers and calculate the sum of all elements in an array.
		int[] num= {45, 78, 12, 46, 99};
        int sum=0;
        for(int n:num) {
            sum+=n;
        }
        System.out.println(sum);
        System.out.println("-----------");
        int[] arr= {1,2};
        int sum1=0;
        for (int c=0; c<arr.length; c++) {
            sum=sum+arr[c];
        }
        System.out.println(sum);
	}
           
           


		
           

		}

