package com.java.Inheritance;
//Method Overiding in Inheritance
public class Animals {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animals
class Dogs extends Animals {

    // overriding the eat() method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class Mains {
    public static void main(String[] args) {

        // create an object of the subclass
        Dogs labrador = new Dogs();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}
