package com.java.Inheritance;

//calling using super method
public class AnimalZoo {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class puppies extends AnimalZoo {

    // overriding the eat() method
    @Override
    public void eat() {
        // call method of superclass
        super.eat();
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class MainClass {
    public static void main(String[] args) {

        // create an object of the subclass
        puppies labradors = new puppies();

        // call the eat() method
        labradors.eat();
        labradors.bark();
    }
}

