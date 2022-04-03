package com.company;
//6.Write a java program to perform all arithmetic operations on 2 integers.
import java.util.Scanner;
public class programm6 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operation");
        int a=sc.nextInt();
        System.out.println(a*a);
        int b=sc.nextInt();
        System.out.println(b+b);
        int c=sc.nextInt();
        System.out.println(b-c);
        int d=sc.nextInt();
        System.out.println(d/c);
        int e=sc.nextInt();
        System.out.println(a%e);
    }
}
