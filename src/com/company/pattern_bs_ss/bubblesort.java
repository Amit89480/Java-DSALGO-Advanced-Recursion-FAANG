package com.company.pattern_bs_ss;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={4,3,6,5,3};
//        here arr.length-1 is the last index of the array
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr,int r, int c) {
        if (r == 0) {
            return;
        }
        if(c<r){
        if (arr[c] > arr[c + 1]) {
//            here we are swapping the elements
            int temp = arr[c];
            arr[c] = arr[c + 1];
            arr[c + 1] = temp;

        }
        bubble(arr, r, c + 1);
    }

        else{

            bubble(arr,r-1,0);
            System.out.println( );

        }
    }
}
