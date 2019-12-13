/*
Write a program called FarewellGoodBye that prints the following lyrics. 
Use static methods to show structure and eliminate redundancy in your solution.

Farewell,
goodbye,
au revoir,
good night!
It's time, to go,
and I'll be out of sight!

Farewell,
goodbye,
au revoir,
take care!
I'll say, goodbye,
that's neither here nor there!

Farewell,
goodbye,
au revoir,
see you later!
I hope, you think,
I'm a lover, not a hater!
*/

public class FarewellGoodBye{
    public static void main(String[] args){
        method1();
        System.out.println("good night!");
        System.out.println("It's time, to go,");
        System.out.println("and I'll be out of sight!");
        System.out.println();
        method1();
        System.out.println("take care!");
        System.out.println("I'll say, goodbye,");
        System.out.println("that's neither here nor there!");
        System.out.println();
        method1();
        System.out.println("see you later!");
        System.out.println("I hope, you think,");
        System.out.println("I'm a lover, not a hater!");
    }
    public static void method1(){
        System.out.println("Farewell,\ngoodbye,\nau revoir,");
    }
    
}
