package com.java.Polymorphisim.MethodOverriding;

public class Vehicle {
    //Java Program to illustrate the use of Java Method Overriding
    void run() {
        System.out.println("Vehicle is running");
    }

    public static void main(String args[]) {
        Bike2 obj = new Bike2();
        obj.run();
    }
}




