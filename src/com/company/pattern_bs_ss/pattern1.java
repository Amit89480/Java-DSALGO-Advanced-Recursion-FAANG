package com.company.pattern_bs_ss;

public class pattern1 {
    public static void main(String[] args) {
        triangle(4,0);
        triangle2(4,0);

    }
    static void triangle(int row, int column){
        if(row==0){
            return;
        }
        if(column<row){
            System.out.print("*");
            int nextColumn =column+1;


            triangle(row,nextColumn);


        }
        else{
            int next= row-1;
            int nextColumn = 0;
            System.out.println( );
            triangle(next,nextColumn);

        }
    }



    static void triangle2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){

            triangle2(r,c+1);
            System.out.print("*");


        }
        else{

            triangle2(r-1,0);
            System.out.println( );

        }
    }

}
