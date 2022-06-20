package com.company.Maths;

public class GCD_Eucalidian {
    public static void main(String[] args) {
//        System.out.println(gcd(2,4));
        System.out.println(lcm(4,60));

    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }

}
