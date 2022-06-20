package com.company.string;

public class stream {
    public static void main(String[] args) {
        skip("","bccaah");

    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
       char ch = up.charAt(0);
        if(ch == 'a')
        {
            skip(p,up.substring(1));
        }
//here we are adding with process the process(p+ch) here p is the process and up is unprocess
           else
           {
               skip(p+ch,up.substring(1));
        }
    }
}

