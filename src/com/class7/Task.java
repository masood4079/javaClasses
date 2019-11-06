package com.class7;

public class Task {
		/*creat a boolean variable workday and assign true
		 * creat int variable day and assign it to 1
		 * as long as it is workday print"I need a day off"and increase day
		 * once day is 6 print " I do not need day off any more"
		 * 
		 */
	public static void main(String[]args) {
		boolean workday =true;
		int day=1;
		 while(workday) {
			 System.out.println("I need a day off");
			 
			 if(day==6) {
				 System.out.println("I do not need a day off" );
				 workday=false;
			 }	
			 day++;
		 
}
}
}