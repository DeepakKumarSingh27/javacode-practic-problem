package com.company;

import java.util.Scanner;

//48.wajp to define a method to return no of digits in the passed no
public class program_48 {
    public static int number(int num){
         int i=0;
        while (num != 0) {
            num /= 10;
            ++i;
        }
        return i;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=number(a);
        System.out.println(b);
    }
}
