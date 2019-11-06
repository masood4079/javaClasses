package com.class11;

public class TwoDiementionArray {

	public static void main(String[] args) {
//Declare 2d Array
        
        int[][]array= new int[3][4];// 3 rows and 5 colomns
        
        //1st Row
        array [0][0]=45;
        array[0][1]= 80;
        array [0][2]=33;
        array [0][3]=20;
        
        //2nd row
        
        array [1][0]=90;
        array[1][1]= 87;
        array [1][2]=43;
        array [1][3]=33;
        //3rd Row
        array [2][0]=90;
        array[2][1]= 65;
        array [2][2]=11;
        array [2][3]=97;
        System.out.println(array[1][3]);
        // task: creat 2D array of string with 2 and 3 columns
        String [] [] ar = new String [2] [3];
        ar[0] [0] = "Hello";
        ar[0] [1] = "World";
        ar[0] [2] = "!!!";
        
        ar[1] [0] = "I";
        ar[1] [1] = "Love";
        ar[1] [2] = "Programming";
              System.out.println(ar [1] [2]);
         System.out.println("---------------");
         int [][] numbers= {
                 {8,7,5,3,8},
                 {1,5,6,4,9},
                 {3,6,8,0,7}    
         };
         
         System.out.println("The value in index 1 and 4 is= "+numbers[1][4]);
         
         //To identify the numbers of Rows
         System.out.println("The numbers of Rows are:= "+numbers.length);
         
         //To identify the numbers of Columns/elements in that row
         System.out.println("The numbers of Rows are:= "+numbers[1].length);
     }
 
        	 
         }

         
	


