package com.company.ofBits;

public class ofbits {
    public static void main(String[] args) {
        int n = 5;


        int ans = 0;
        while (n > 0) {
            ans = n & (1 << (n - 1));
        }
        System.out.println(ans);
    }
}
