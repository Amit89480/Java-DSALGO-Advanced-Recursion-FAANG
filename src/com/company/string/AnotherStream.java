package com.company.string;

public class AnotherStream {
    public static void main(String[] args) {
        System.out.println(skip("bccaad"));

    }
//    here we are doing by directly passing the string to the arguments
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a')
        {
            return skip(up.substring(1));
        }
//here we are adding with process the process(p+ch) here p is the process and up is unprocess
        else
        {
            return ch+skip(up.substring(1));
        }
    }
}
