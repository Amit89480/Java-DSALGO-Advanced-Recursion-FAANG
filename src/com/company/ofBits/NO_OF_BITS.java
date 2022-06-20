package com.company.ofBits;

public class NO_OF_BITS {
    public static int countSetBits(int n)
        {


            if (n == 0)
                return 0;

            else


                return (n & 1) + countSetBits(n >> 1);
        }


        public static void main(String[] args)
        {


            int n = 9;


            System.out.println(countSetBits(n));
        }
    }








