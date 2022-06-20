package com.company.oops;

public class oops1 {
    public static void main(String[] args) {
//        here we are modifying the objects
        student amit = new student();/*<-- this student() is a constructor basically a function type*/
        student misti = new student(1, "misti", 56);
        System.out.println(misti.rno);


//        amit.rno = 56;
//        amit.name = "Amit";
//        amit.marks =56.52f;
//    System.out.println(amit.rno);
//    System.out.println(amit.marks);
//    System.out.println(amit.name);
//    }
//        student random = new student(1,"Amit",89);
//        System.out.println(random.name);
        student random2 = new student();
        System.out.println(random2.name);
        student one = new student();
//        here they are pointing to the same object
        student two = one;
        two.name="amit";
        System.out.println(one.name);
//here this object cannot further be modified
       final student r = new student(5);
       r.rno = 8;
       System.out.println(r.rno);


    }
}
//here we are instantiating the object
class student{
    int rno;
    String name;
    float marks;

//    here we rae creating the object of another constructor
    student(student other){
        int marks;
        String name;
        int roll;
    }


    student (){
        this(1,"amit2",89);
    }
//    for above constructor the below one will be called so this is  called calling  constructor from another constructor
    student(int roll,String nam,int mark){
        rno=roll;
        name=nam;
        marks=mark;


    }

public student(int rno) {
        this.rno = rno;
    }
}
