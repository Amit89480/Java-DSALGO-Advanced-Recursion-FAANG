package com.company.array_recursion;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        int[] arr={3,6,7,4,4,3};
        int target =4;
        System.out.println(Arraylist(arr,target,0));

    }
//    another way to find all indexes but this is not a good way as everytime it creates a new list object at the new function call
    static ArrayList<Integer> Arraylist(int[] arr,int target,int index){
        ArrayList<Integer> list =new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
       ArrayList<Integer> belowcallsadd = Arraylist(arr,target,index+1);
        list.addAll(belowcallsadd);
        return list;

    }
}
