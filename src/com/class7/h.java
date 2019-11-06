package com.class7;

import java.util.Scanner; 
class Main {
   
   public static void main (String[] args) {
   Scanner scan;
   boolean weekend;
   String subject;
   
   
   scan=new Scanner (System.in);
   System.out.println("Is it weekend?");
   weekend=scan.nextBoolean();
    
    if (! weekend) {
      subject="Manul Testing";
    }else{
      subject="Java";
    }
    System.out.println("Today you will be learning "+subject);

}
}