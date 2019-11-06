package com.class7;

public class practice3 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        for( int h=1; h<24; h++) {
            if(h<13) {
            System.out.println("Next hour");
            for (int m=1; m<=60; m++) {
                if (m==60) {
                System.out.println(h+1+":00"+"am");
                }
                else if(m<10) {
                System.out.println(h+":0"+m+"am");
                }else {
                System.out.println(h+":"+m+"am");
            }
            }
            }else {
                System.out.println("Next hour");
                for (int m=1; m<=60; m++) {
                    if (m==60) {
                    System.out.println(h-11+":00"+"pm");
                    }else if(m<10) {
                    System.out.println(h-12+":0"+m+"pm");
                    }else {
                    System.out.println(h-12+":"+m+"pm");
            }
                    
        }
    }
}
}
}

