package com.company.Bitwise;

public class computerXor {
    public static void main(String[] args) {
////
//        Method 1 (Naive Approach):
//        1- Initialize result as 0.
//        1- Traverse all numbers from 1 to n.
//        2- Do XOR of numbers one by one with result.
//        3- At the end, return result.
//                Method 2 (Efficient method) :
//        1- Find the remainder of n by moduling it with 4.
//        2- If rem = 0, then xor will be same as n.
//        3- If rem = 1, then xor will be 1.
//        4- If rem = 2, then xor will be n+1.
//        5- If rem = 3 ,then xor will be 0.

        int n = 7;
        System.out.println(findxor(n));
    }

    private static int findxor(int n) {
        if (n % 4 == 0) {
            return n;
        }
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n + 1;

        }
        if (n % 4 == 3) {
            return 0;
        }
        return n;
    }
}
