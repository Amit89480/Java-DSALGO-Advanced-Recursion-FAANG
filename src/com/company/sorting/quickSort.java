package com.company.sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,6};
//        quick(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

//        internal sort and hybirid sorting algorithm
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
  static void quick(int[] arr,int low,int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e =hi;
        int m= s+(e-s)/2;
        int pivot =arr[m];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp =arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }



        }
        quick(arr,low,e);
        quick(arr,s,hi);
  }
}
