package com.company.sorting;

import java.util.Arrays;

public class inplacemergesort {
    public static void main(String[] args) {
        int[] arr={4,6,2,4,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }


    static void mergesort(int[] arr,int s,int e) {
        if ((e-s)== 1) {
          return;
        }
        int mid = (s+e) / 2;
        mergesort(arr, s, mid);
        mergesort(arr, mid, e);
        merge(arr,s,mid,e);
    }

    static void merge(int[] arr,int s,int mid,int e) {
        int[] mix = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;

            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;

        }
//        yaha pe case ho sakta hai ki kisi array ka element bach jaaye
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;

        }
        for(int l =0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
}

