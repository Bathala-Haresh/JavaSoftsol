package com.java.exceptions;

public class TryCatchExample2 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0;
        }
        //handling the exception
        catch (ArithmeticException e) {
            System.out.print(e);
        }
    }
}
