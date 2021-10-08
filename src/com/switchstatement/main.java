package com.switchstatement;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        if (fruit.equals("mango")) {
            System.out.println("King of fruits");
        } else if ("apple".equals(fruit)) {
            System.out.println("A sweet red fruits");
        } else if ("grapes".equals(fruit)) {
            System.out.println("tiny and sweet friuts");
        } else {
            System.out.println("Please enter a valid fruits");
        }
    }
}