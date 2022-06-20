package com.company.inheritance;

public class Boxprice extends child{

    double price = -1;


    public Boxprice(double weight) {
        super(weight);
    }

    public Boxprice(double l, double h, double w, double weight,double price) {
        super(l, h, w, weight);
        this.price = price;
    }

    public Boxprice(box old, double weight) {
        super(old, weight);
    }
}
