package com.company.StaticExample;

public class statictest {
     static int a =8;
     static int b;
//     will execute only once the class is loaded
     static{
         System.out.println("hey i m static block");

         b=a*2;

     }

    public static void main(String[] args) {
//         instantiating the static
        statictest obj = new statictest();
        obj.b+=3;
        System.out.println(statictest.a+"  "+statictest.b);

    }
}
