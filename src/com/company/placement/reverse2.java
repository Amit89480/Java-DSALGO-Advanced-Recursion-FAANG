package com.company.placement;


import java.util.Arrays;
import java.util.Collections;

public class reverse2 {
    public static void main(String[] args) {
        Integer [] arr={1,2,3,4,5,6,7};
        reverse(arr);

    }
    static void reverse(Integer arr[]){
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }

}
// Reversing an array using Java collections
//import java.util.*;
//
//public class reverse2 {
//
//    // function reverses the elements of the array
//    static void reverse(Integer a[])
//    {
//        Collections.reverse(Arrays.asList(a));
//        System.out.println(Arrays.asList(a));
//    }
//
//    public static void main(String[] args)
//    {
//        Integer [] arr = {10, 20, 30, 40, 50};
//        reverse(arr);
//    }
//}

