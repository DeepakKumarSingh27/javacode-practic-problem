package com.company;
//10.Write a java program to check user entered no. is even or odd without using modulus operator
import java.util.Scanner;
public class programm_10 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=(a/2)*2;
        if(b==a){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
