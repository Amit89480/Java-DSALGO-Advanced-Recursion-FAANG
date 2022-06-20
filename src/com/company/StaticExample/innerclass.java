package com.company.StaticExample;

public class innerclass {
//     here it will come the output as rahul,rahul because of the outside static


    static class a{
       String name;

        @Override
        public String toString() {
            return name;
        }

        public a(String name) {
            this.name = name;

        }
    }

  public static void main(String[] args) {
        a amit = new a("Amit");
        a rahul = new a("Rahul");
//        System.out.println(amit.name);
//        System.out.println(rahul.name);
        System.out.println(amit);
        System.out.println(rahul);
    }
}
