package com.company.placement;

public class rotateanarray {



        public void rotate(int[] nums, int k) {
            int n=nums.length;
            k=k%n;
            int[] ans = new int[n];
            for(int i=n-k;i<n;i++){
                ans[i-(n-k)] = nums[i];
            }
            for(int i =k;i<n;i++){
                ans[i]=nums[i-k];
            }
            for(int i=0;i<n;i++){
                nums[i] =ans[i];
            }


        }
    }


class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;
        k = k % n;
        flip(nums,0,n-1);
        flip(nums,0,k-1);
        flip(nums,k,n-1);
    }


    public void flip(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}

