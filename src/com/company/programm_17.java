package com.company;
//17.Write a java program to read the age of a person and print that person is eligible to vote or not.
import java.util.Scanner;
public class programm_17 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of Human");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("you can vote now ");
        }
        else{
            System.out.println("you are not eligible for vote ");
        }
    }
}
