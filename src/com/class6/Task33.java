import java.util.Scanner; 
class Main {
 //write code below
 public static void main(String[] args){
   Scanner scan =new Scanner(System.in);
   System.out.println("enter the roll number of child");
   int roll=scan.nextInt();
   String name="null";
   switch(roll){
     case 101:
       name="zaki";
       System.out.println("student name" +name);
       break;
       case 102:
         name="haq";
         System.out.println("student name" +name);
         break;
         case 103:
           System.out.println("student name" +name);
           break;
           default:
           System.out.println("Not found Stdudent name: in class");
      
         
         
   }
 }
}
    







