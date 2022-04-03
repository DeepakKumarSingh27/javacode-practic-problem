package com.company;
//15.Write a java program to read two integer no from user and print biggest among those two no by using ternary operator.
import java.util.Scanner;
public class program_15 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=(a>b)?a:b;
        System.out.println("Biggest number is" + " "+c+"  ");
    }
}
