/*
Write a complete Java program in a class named Lanterns that generates the following three figures of output. Use static methods to show structure and eliminate redundancy in your solution.

In particular, make sure that main contains no System.out.println statements except for blank lines, that any System.out.println statement(s) repeated are captured in a method that is called just once, and that the same System.out.println statement never appears in two places in the code.

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****
    */
    
public class Lanterns{
    public static void main(String[] args){
        method2();
    }
    public static void method2(){
        for (int ltrn = 0; ltrn < 4; ltrn++){
            System.out.println("    *****");
            System.out.println("  *********");
            System.out.println("*************");  
            if (ltrn == 0){
            System.out.println();            
            }
            if (ltrn == 1){
            System.out.println("* | | | | | *");            
            System.out.println("*************");
            }
            if (ltrn == 2){
                System.out.println();
            }
            else if (ltrn == 3){
                System.out.println("    *****    \n* | | | | | *\n* | | | | | *\n    *****    \n    *****");
            }
      
        }
                
    }
    
}
