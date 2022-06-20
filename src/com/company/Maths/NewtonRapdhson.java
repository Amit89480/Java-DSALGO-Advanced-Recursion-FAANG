package com.company.Maths;

public class NewtonRapdhson {
    public static void main(String[] args) {
        double n=40;
        System.out.println(newton(n));

    }
    static double newton(double n){

        double x=n;
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }
        return root;
    }
}



