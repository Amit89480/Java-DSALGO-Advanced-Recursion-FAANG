package com.company.Googleqs;

public class letterCombination {
    public static void main(String[] args) {
//        letter combinations of a number
        ltcombi("","23");
    }
    static void ltcombi(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i =(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            ltcombi(p+ch,up.substring(1));
        }
    }
}
