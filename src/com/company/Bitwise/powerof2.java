package com.company.Bitwise;

public class powerof2 {
    public static void main(String[] args) {
        int n=34;
        boolean ans= (n&(n-1))==0;
        System.out.println(ans);


    }
}
