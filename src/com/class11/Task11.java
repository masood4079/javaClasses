package com.class11;

public class Task11 {

	public static void main(String[] args) {
		// Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.		
		int[][] numbers = { { 8, 7, 5, 3},
                          { 1, 5, 6, 4},
                          { 3, 6, 8, 0}};
for (int i=0; i<numbers.length; i++) {
    for (int j=0; j<numbers[i].length; j++){
        System.out.print(numbers[i][j]+" ");
    }
    System.out.println();
   
 
}
System.out.println("-------------------");
int [][] number1= {
        {3,5,6},
        {4,7,9},
        {7,8,5}
};
int sum=0;

for (int getNum[]: number1) {
    for(int getCol:getNum){
        sum+=getCol;
        
    }  
}
System.out.println(sum);
}
	}	




