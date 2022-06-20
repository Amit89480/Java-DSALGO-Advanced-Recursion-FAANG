package com.company.Maths;

public class palidrome {
    public static void main(String[] args) {
      System.out.print(pali(12344321));

    }
    static int rev(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }
    static boolean pali(int n){
        return n==rev(n);
    }
    static int helper(int n,int digit){
        if(n%10==n){
            return n;
        }
        else{
            int rem=n%10;
            return rem*(int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
        }
    }
}
