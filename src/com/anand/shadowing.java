package com.anand;

public class shadowing {
    static int x = 60; // this will be shadowed or hidden at line at 8
    public static void main(String[] args) {
        System.out.println(x); // print 60
        int x = 85; // the class variable at line 4 is shadowed by this
        System.out.println(x); // print 85
        fun();

    }
    static void  fun(){
        System.out.println(x); // print 60
    }
}
