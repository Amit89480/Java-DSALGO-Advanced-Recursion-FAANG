package com.company.pattern_bs_ss;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={2,4,6,2,7};
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr,r,c+1,c);
            }
            else{
                selection(arr,r,c+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selection(arr,r-1,0,max);
        }
    }

}
