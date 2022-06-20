package com.company.Maths;

public class sumOFDigits {
    public static void main(String[] args) {
        System.out.println(digitsum(545));
        System.out.println(digitprod(545));

    }
    static int digitsum(int  n){
        if(n==0){
            return 0;
        }
        else{
            return digitsum(n/10)+(n%10);
        }
    }
//    now lets say product of digitno
static int digitprod(int  n){
    if(n%10==n){
        return n;
    }
    else{
        return (n%10)*digitprod(n/10);
    }
}
}
