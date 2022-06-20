package com.company.array_recursion;

import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
        int[] arr={3,6,7,4,4,3};
        int target =4;
        System.out.println(search(arr,target,0));
        System.out.println(searchno(arr,target,0));
        findall(arr,4,0);
        System.out.println(list);
        System.out.println(findaanother(arr,target,0,list));

    }

    static boolean search(int[] arr, int target, int index) {
        if(index==arr.length){
            return false;

        }
        return arr[index]==target || search(arr,target,index+1);
    }
//    here we are returning the index position also
    static int searchno(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return searchno(arr,target,index+1);
        }
    }
//    here we are using the array list to find all the same number indexes
static ArrayList<Integer> list = new ArrayList<>();
    static void findall(int[] arr, int target, int index){

        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }

           findall(arr,target,index+1);
    }
//    here we are directly using the arraylist in the function call
    static ArrayList findaanother(int[] arr, int target, int index,ArrayList<Integer> list){

        if(index==arr.length){
            return list ;
        }
        if(arr[index]==target){
            list.add(index);
        }

         return findaanother(arr,target,index+1,list);
    }

    }




