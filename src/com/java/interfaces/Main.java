package com.java.interfaces;
// Interface
interface Animal {
    // interface method (does not have a body)
    public void animalSound();

    public void sleep();
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}
public class Main {
    public static void main(String[] args) {
        Pig obj = new Pig();
        obj.animalSound();
        obj.sleep();
    }
}
