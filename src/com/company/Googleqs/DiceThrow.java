package com.company.Googleqs;

public class DiceThrow {
    public static void main(String[] args) {
        customdice("",4,9);

    }
    static void dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i =1;i<=target;i++){
            dice(p+i,target-i);
        }
    }
//    with dice custom face
 static void customdice(String p,int target,int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i =1;i<=face&&i<=target;i++){
            customdice(p+i,target-i,face);
        }
    }
}
