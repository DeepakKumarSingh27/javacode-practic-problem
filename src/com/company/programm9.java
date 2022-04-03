package com.company;
//Write a java program to check user entered no. is even or odd.
import java.util.Scanner;
public class programm9 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter thr number");
        int a=sc.nextInt();
        if(a % 2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
