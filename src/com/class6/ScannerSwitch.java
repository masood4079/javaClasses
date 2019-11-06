package com.class6;

import java.util.Scanner; 
class Main {
 //write code below
 public static void main (String[] args){
   Scanner inp=new Scanner(System.in);
   System.out.println("Enter name of the instructor");
   String pro;
   pro=inp.nextLine();
   switch(pro){
     case "Shiva":
     System.out.println("Will take care of Java Assignment");
     break;
     case "Sandish":
     System.out.println("Will take care of SDLC Assignment");
     break;
     case "Weqas":
     System.out.println("Will take care of Selenium Assignment");
     break;
     case "Asel":
     System.out.println("Will take care of every Assignment");
     break;
     default:
     System.out.println("Invalid instructer selected");
   }
   
 }
}