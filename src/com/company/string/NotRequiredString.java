package com.company.string;

public class NotRequiredString {
    public static void main(String[] args) {
        System.out.println(notreq("bccappapple"));

    }
    static String notreq(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith(("app"))&& !up.startsWith("apple"))
        {
            return  notreq(up.substring(3));
        }
//here we are adding with process the process(p+ch) here p is the process and up is unprocess
        else
        {
            return up.charAt(0)+notreq(up.substring(1));
        }
    }
}
