package com.company.StaticExample;

public class human {
    int id;
    String Name;
    static int noofp;/*no. of person*/


    public human(int id, String name) {
        this.id = id;
        this.Name = name;
        human.noofp+=1;
    }
}
