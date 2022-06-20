package com.company.inheritance;

public class box {
    double l;
    double h;
    double w;

    box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;


    }

    box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    box(box old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;
    }
}
