package com.company;
//14.Write a java program to read the no from user and print it is negative or positive.
import java.util.Scanner;
public class programm_14 {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("it is positive number");
        }
        else{
            System.out.println("it is negative number");
        }
    }
}
