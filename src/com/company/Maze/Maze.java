package com.company.Maze;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));
        path("",3,3);
//pathdiagonal("",3,3);
    }

//    in how many ways we can traverse the board or let's say maze

    static int maze(int r,int c){
        if(r==1||c==1){
            return 1;
        }
//        here decreasing row by 1
        int left =maze(r-1,c);
//        here decreasing column by 1
        int right =maze(r,c-1);
        return left+right;
    }
//    for finding the path
    static void path(String p,int r,int c) {
        if (c == 1 && r == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r-1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c-1);
        }


    }
//    here we are printing diagonal
static void pathdiagonal(String p,int r,int c) {
    if (c == 1 && r == 1) {
        System.out.println(p);
        return;
    }
    if(r>1&&c>1){
        pathdiagonal(p+'D',r-1,c-1);
    }
    if (r > 1) {
        pathdiagonal(p + 'V', r-1, c);
    }
    if (c > 1) {
        pathdiagonal(p + 'H', r, c-1);
    }


}
}
