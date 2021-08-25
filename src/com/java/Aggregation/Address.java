package com.java.Aggregation;

//If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
public class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}

