package com.anand;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the numbers ");
        int a    = in.nextInt();
        int b  = in.nextInt();

        // swap two number
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a + " " + b );


        

    }
}
