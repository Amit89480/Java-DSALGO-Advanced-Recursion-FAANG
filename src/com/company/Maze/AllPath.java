package com.company.Maze;

public class AllPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        all("",maze,0,0);

    }
    static void all(String p,boolean[][] maze,int r ,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

//        here we are marking the visited array as false
        maze[r][c]=false;
        if(r<maze.length-1){
            all(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            all(p+'R',maze,r,c+1);
        }
        if(r>0){
            all(p+'U',maze,r-1,c);
        }
        if(c>0){
            all(p+'L',maze,r,c-1);
        }
//        here we are restoring the array as it was
        maze[r][c]=true;
    }
}
