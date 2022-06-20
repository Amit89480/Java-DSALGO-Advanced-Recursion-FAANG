package com.company.Bitwise;

public class calculatebaseApowB {
    public static void main(String[] args) {
        int base=3;
        int pow=6;
        int ans=1;
//        initial ans stored

//        condition
        while(pow>0){
            if((pow&1)==1){
//                everytime we multiply ans with base
                ans*=base;
            }
            base*=base;
//            here we have to decrease the power
            pow=pow>>1;
        }
        System.out.println(ans);
    }
}
