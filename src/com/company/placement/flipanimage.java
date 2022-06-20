package com.company.placement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class flipanimage {
    public static void main(String[] args) {
        int[][] arr= {{0,0,1},
                {0,1,1},
                {1,0,0}
        };
        System.out.println(Arrays.toString(image(arr)));

    }
    static int[][] image(int [][] image){
        int m = image.length;
        int n=image[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<(n+1)/2;j++){
                int temp = image[i][j];
                image[i][j] = image[i][n-j-1]^1;
                image[i][n-j-1] =temp^1;

            }
        }
        return image;
    }
}
