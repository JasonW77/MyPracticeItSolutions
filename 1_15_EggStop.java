/*
Write a complete Java program in a class named EggStop that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

  ______
 /      \
/        \
\        /
 \______/

  ______
 /      \
/        \
\        /
 \______/
+--------+

  ______
 /      \
/        \
|  STOP  |
\        /
 \______/
+--------+

*/


public class EggStop{
    public static void main(String[] args){
        method();
        method1();
        System.out.println();
        method();
        method1();
        method2();
        System.out.println();
        method();
        method3();
        method1();
        method2();
    }
    public static void method(){
        System.out.println("  ______");
        System.out.println(" /      \\ ");
        System.out.println("/        \\ ");
    }
    public static void method1(){
        System.out.println("\\        / ");
        System.out.println(" \\______/  ");
    }
    public static void method2(){
        System.out.println("+--------+");
    }
    public static void method3(){
        System.out.println("|  STOP  |");
    }
}
