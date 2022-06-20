package com.company.Maze;

public class maze_obstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
obstacles("",maze,0,0);
    }
    static void obstacles(String p,boolean[][] maze,int r,int c) {
        if (r==maze.length-1 && c==maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        if (r < maze.length-1) {
            obstacles(p + 'D',maze, r+1, c);
        }
        if (c < maze[0].length-1) {
            obstacles(p + 'R',maze, r, c+1);
        }


    }
}
