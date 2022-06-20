package com.company.Maths;

public class reverse {
    public static void main(String[] args) {
        System.out.println(rev(5678));

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
    static int rev(int n){
       int digit=(int)(Math.log10(n))+1;
        return helper(n,digit);
    }

}
