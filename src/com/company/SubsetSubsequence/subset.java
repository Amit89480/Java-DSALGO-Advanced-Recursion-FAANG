package com.company.SubsetSubsequence;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
       System.out.println(subsetarr("","abc"));

    }
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch =up.charAt(0);
//        here we are adding it according to the case
        subset(p+ch,up.substring(1));
//        here we are ignoring it according to the case
        subset(p,up.substring(1));
//        and the print it in orders just reverse the conditons
    }

//    now y using the arraylist method
static ArrayList<String> subsetarr(String p, String up){
    if(up.isEmpty()){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }
    char ch =up.charAt(0);
//        here we are adding it according to the case
    ArrayList<String> left =subsetarr(p+ch,up.substring(1));
//        here we are ignoring it according to the case
    ArrayList<String> right = subsetarr(p,up.substring(1));
//here we are adding both the right and left list
    left.addAll(right);
//    here we can return any of the right or the left list as after adding it is same
    return left;
}

}
