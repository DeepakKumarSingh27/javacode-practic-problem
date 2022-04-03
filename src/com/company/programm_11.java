package com.company;
//11.Write a java program to check user entered no. is even or odd without using ifelse statement. Using Ternary operator
import java.util.Scanner;
public class programm_11 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        String b=(a % 2 ==0) ? "even" : "odd";
        System.out.println(b );
    }
}
