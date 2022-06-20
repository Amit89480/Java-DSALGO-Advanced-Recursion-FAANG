package com.company.inheritance;

public class child extends box {
    double weight;

    public child(double weight) {
        this.weight = weight;
    }

    public child(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public child(box old, double weight) {
        super(old);
        this.weight = weight;
    }
}
