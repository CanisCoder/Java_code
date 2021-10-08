package com.anand;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        String name = "Rahul";

        {
    //         int a = 59;  // already intialised outside the block
           a = 77;  // but we can change the value
           System.out.println(a);
           int c = 90;
           // value intialised in this block, will remain in block
            name = "Kunal";

            System.out.println(name);

        }
        System.out.println(a);
        System.out.println(name);
    }
    static void random (){
        int num = 56;
        System.out.println(num);
    }
}
