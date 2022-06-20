package com.company.Bitwise;

public class primeNO {
    public static void main(String[] args) {
        int n=17;
        for(int i=1;i<=n;i++) {
            System.out.println(i + " " + isprime(i));
        }
    }

    private static boolean isprime(int n) {
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
//
//    or another method

//    static boolean isprime(int n){
//        if(n<=1){
//            return false;
//        }
//        int c=2;
//        while(c*c<=n){
//            if(n%c==0){
//                return false;
//            }
//            c++;
//
//        }
//        return true;
//    }
}
