package com.company.Maths;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int m;

Scanner in = new Scanner(System.in);
System.out.println("enter your number");
m= in.nextInt();
    System.out.println(fibo(m));
    }



//    recursively printing a number

    static int fibo(int n){


        if(n<2){
            return n;
        }

else
//    this is not a tail recursion
        return fibo(n-1)+fibo(n-2);
    }
}
