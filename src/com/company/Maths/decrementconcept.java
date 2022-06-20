package com.company.Maths;

public class decrementconcept {
    public static void main(String[] args) {
        dec(5);


    }
    static void  dec(int n){
        if(n==0){
            return ;
        }
        else{
            System.out.println(n);
            dec(--n);
//            --n will give the reverse of n and n-- will give the stack overflow

        }
    }
}
