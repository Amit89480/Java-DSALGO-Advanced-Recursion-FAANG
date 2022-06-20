package com.company.Bitwise;

public class setBits {
    public static void main(String[] args) {
        int n=6;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    static int setBits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }

}
