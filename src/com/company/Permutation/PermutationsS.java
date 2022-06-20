package com.company.Permutation;

public class PermutationsS {
    public static void main(String[] args) {
      System.out.println(countperm("","abc"));

    }
    static void per(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f =p.substring(0,i);
            String s = p.substring(i,p.length());
            per(f + ch + s,up.substring(1));

        }
    }
//    here we are doing the permutations count

    static int countperm(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f =p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count +countperm(f + ch + s,up.substring(1));

        }
        return count;
    }
}
