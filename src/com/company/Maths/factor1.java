package com.company.Maths;

import java.util.ArrayList;

public class factor1 {
    public static void main(String[] args) {
        int n=20;
        factor(n);

    }
    static void factor(int n){
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
    static void factor2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == 0) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i+ " ");
                    list.add(n/i);
                }

            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));

    }

    }
}
