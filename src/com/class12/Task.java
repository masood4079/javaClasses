package com.class12;

public class Task {
	 // Create two Strings and initaialize them with some value.
    //implement the following methods on those strings.
    
    /*
     * sen.length();
     * sen.equals();
     * sen.contains(s);
     * sen.toUpperCase();
     * sen.toLowerCase();
     * sen.equalsIgnoreCase(anotherString);
     */
public static void main(String[] args) {
	String world1="Today is Sunday";
	String world2="I want to drink some tea";
	    
	            System.out.println("world1's length is "+world1.length());
	            System.out.println("world2's length is "+world2.length());
	            
	            System.out.println();
	            System.out.println(world1.equals(world2));
	            System.out.println(world2.equals(world1));
	            
	            System.out.println();
	            System.out.println(world1.contains("Today"));
	            System.out.println(world2.contains("tea"));
	            
	            System.out.println();
	            System.out.println(world1.toUpperCase());
	            System.out.println(world1.toLowerCase());
	            
	            System.out.println();
	            System.out.println(world2.toUpperCase());
	            System.out.println(world2.toLowerCase());
	            
	            System.out.println();
	            System.out.println(world1.equalsIgnoreCase(world2));
	            System.out.println(world2.equalsIgnoreCase(world1));
	
}
       


	
}

