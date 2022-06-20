package com.company.Singleton;

public class main {
    public static void main(String[] args) {
//        this all contructors will be poiniting to the same objects of the singleton class as the singleton class is allowed to create only one instances
        Singleton obj =Singleton.getInstances();
        Singleton obj2 =Singleton.getInstances();
        Singleton obj3 =Singleton.getInstances();
    }
}
