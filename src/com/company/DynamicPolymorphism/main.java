package com.company.DynamicPolymorphism;

public class main {
    public static void main(String[] args) {

//        here we are overriding as they have same methods as of parent class that is shape class
        Shape Square = new square();
       Shape Triangle= new traingle();
        Square.area();
        Triangle.area();

    }
}
