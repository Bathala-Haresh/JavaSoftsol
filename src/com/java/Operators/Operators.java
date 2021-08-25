package com.java.Operators;
public class Operators {
    public static void main(String args[]) {
        //variables
        int x = 10;
        int y = -10;

        int a = 2;
        int b = 4;

        //operators incrementing and decrementing
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        System.out.println(x++ + ++x);//10 + 12
        System.out.println(y++ + y++);//-10 + -9

        //Arthimetic Operations
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x % y);
        System.out.println(x / y);
        System.out.println(x * y);

        //left shift operator
        System.out.println(10 << 2);//10*2^2=10*4=40
        //right shift operator
        System.out.println(10 >> 2);//10/2^2=10/4=2

        //Terenary Operator
        int min = (a < b) ? a : b;
        System.out.println(min);

        //Assignment Operator
        a += 4;
        b -= 5;
        System.out.println("a value is "+a+" b value is :"+b );


    }
}
