package com.company.no;

public class ofDigits {
    public static void main(String[] args) {
        int base=2;
        int n=2;
        int ans=(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }
}
