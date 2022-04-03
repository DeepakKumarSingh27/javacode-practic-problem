package com.company;
//7.Write a java program to read your age from the user.
import java.util.Scanner;
public class programm7 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int a=sc.nextInt();
        if(a>18){
            System.out.println("you can vote now");
        }
        else{
            System.out.println("you are not able to vote");
        }
    }
}
