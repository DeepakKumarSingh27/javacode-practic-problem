package com.company;

import java.util.Scanner;

//45.Define a method to return the factorial of n
public class program_45 {
    static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        int b=factorial(a);
        System.out.println(b);
    }
}
