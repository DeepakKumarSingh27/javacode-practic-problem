package com.company;

import java.util.Scanner;

//50.wajp to define a method to check the special two digit no or not
public class program_50 {
    static int specialNumber(int n)
    {
        if(n < 10 || n > 99)
            System.out.println("Invalid Input! " + "Number should have " + "2 digits only");
        else
        {
            int first = n / 10;
            int last = n % 10;
            int sum = first + last;
            int pro = first * last;
            if((sum + pro) == n)
            {
                System.out.println(n + " is a Special" + " Two-Digit Number");
            }
            else
            {
                System.out.println(n +" is Not a Special" + " Two-Digit Number");
            }
        }
        return n;
    }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b= specialNumber(a);
    }
}
