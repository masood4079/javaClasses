package com.class12;

public class StringMinipulationDemo2 {
	public static void main(String[] args) {
        /*
         * .contains();
         * This method  searches the sequence of characters in the string.
         * If the sequences of characters are found,
         * then it returns true otherwise returns false.
         */
        String sentence="It was raining";
        String sen="raining";
        System.err.println(sen.contains(sentence));
        
        System.out.println(sentence.contains("was"));
       
        System.out.println("*************************");
        /*
         * This method tests if a string starts with the
         * specified prefix beginning
         */
        String str2="It is very hot in the class";
        System.out.println("Is this string starts with="+str2.startsWith("It"));
        //System.out.println(�Is this string starts with=�+str2.startsWith(�is�, 3));
        System.out.println("******************");
        
        /*
         * This method tests if this string ends with
         * the specified suffix.
         */
        System.out.println("Is this string ends with="+str2.endsWith("class"));
    }
  
}
