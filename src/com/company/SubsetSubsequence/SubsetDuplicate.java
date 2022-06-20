package com.company.SubsetSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetDuplicate {
    public static void main(String[] args) {
        int[] arr ={1,2,2};
        List<List<Integer>> ans = subsetd(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }

    }
    static List<List<Integer>> subsetd(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end =0;
        for (int i = 0;i<arr.length;i++){
            start = 0;
//            /if my current and previous element is same,s= e+1
            if(i>0&& arr[i]==arr[i-1]){
                start = end +1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j =start;j<n;j++){
                List<Integer> inner =new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                        outer.add(inner);

            }
        }
        return outer;
    }
}
