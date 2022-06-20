package com.company.inheritance;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
//        box box1=new box();
//        System.out.println(box1.h);

        child box3 = new child(2,3,4,1);
        System.out.println(box3.weight+" ");
//        here we will get an error
//        child box4 = new box(4,5,6);

        Boxprice box6 = new Boxprice(2,5,2,1,5);
        System.out.println(box6.price)
;    }
}
