package com.company;

import java.util.Scanner;

//46.wajp to define a method to return sum of digits
public class program_46 {
    public static int digit(int number){
        int sum;
        for( sum=0; number!=0; number/=10)
        {
            sum = sum + number % 10;
        }
        return sum;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        int b=digit(a);
        System.out.println(b);
    }
}
