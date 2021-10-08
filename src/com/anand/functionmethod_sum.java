// function method  return type

package com.anand;
import java.util.Scanner;

public class functionmethod_sum {
    public static void main(String[] args) {

       int ans =  sum();
     //  int ans2 = sum2();
        System.out.println(ans);
      //  System.out.println(ans2);
    }

    // return the value
    static int sum2(){

        Scanner in = new Scanner(System.in);

        System.out.println("Put your  first number");
        int num1 = in.nextInt();
        System.out.println("put your second  number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("summ of numbers is");
      return sum;
      }





    static int sum() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second the number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two number is = " + sum);
       return num1;
    }

   /*
   return type name() {
   //body
   return statement;
   }

    */


}




