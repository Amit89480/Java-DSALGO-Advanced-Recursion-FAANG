package com.company.Bitwise;

public class sumOfN {
    public static void main(String[] args) {
        System.out.println(sum(25));

    }
    static int sum(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n+(sum(n-1));
//            same goes for subtraction of n numbers
        }
    }
}
