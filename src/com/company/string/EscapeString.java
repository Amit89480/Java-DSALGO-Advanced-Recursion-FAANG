package com.company.string;

public class EscapeString {
    public static void main(String[] args) {
        System.out.print(skipapple("bccapplegg"));

    }
    static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith(("apple")))
        {
           return  skipapple(up.substring(5));
        }
//here we are adding with process the process(p+ch) here p is the process and up is unprocess
        else
        {
            return up.charAt(0)+skipapple(up.substring(1));
        }
    }
}
