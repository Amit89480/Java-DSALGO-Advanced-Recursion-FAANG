package com.company.StaticExample;

public class Main {
    public  static void main(String[] args) {
        human amit = new human(1,"Amit");
        human misti = new human(1,",misti");
        System.out.println(human.noofp);
        System.out.println(human.noofp);


    }
    void greeting(){
        System.out.println("Hellow!!!!!");
//        a static member can be accessed in a non-static
        fun();
    }
    static void fun(){
//        you cannot access non-static stuff without referencing their instance in a static context
//so here we are referencing it

//        in a static we cannot access non static content
        Main obj = new Main();
        obj.greeting();


    }
}
