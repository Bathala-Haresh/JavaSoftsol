package com.java.encapsulation;

public class TestStudent {
    public static  void main(String args[])
    {
        Student obj=new Student();
        obj.setId(1);
        obj.setName("Haresh");
        obj.setRollNo(12);
        obj.setAdress("Srikakulam");

        System.out.println(obj.getId() + " "+obj.getName()+ " "+obj.getRollNo()+ " "+obj.getAdress());
    }
}
