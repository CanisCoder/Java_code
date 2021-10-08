package com.anand;

import java.util.Arrays;

public class variable_aragument {
    public static void main(String[] args) {
        System.out.println("here is your printed arrays for fun1");
     fun1(58,95,95,9,7,96,43);
     fun1(5,34,4,65,867,0,86,4);

        System.out.println("here is the arrays for fun2");
     fun2(54,64,"Anand", "Maurya", "althyyae5");

    }
    static void fun2(int a, int b, String...z){

        System.out.println(Arrays.toString(z));
    }

    static void fun1(int...v) {

        System.out.println(Arrays.toString(v));
    }
}