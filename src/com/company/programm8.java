package com.company;
//8.Write a java program to read int no from user and check that no. is special 2 digit no. or not.
import java.util.Scanner;
public class programm8 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter your integer number");
        int a=sc.nextInt();
        if(a>10 && a<99){
            int l=a%10;  // Extrect the digit
            int f=a/10;  // Extrect the digit
            int s=l+f;  // sum
            int p=l*f; // product
            if(a==s+p){
                System.out.println("special 2 digit number");
            }
            else{
                System.out.println("not a special 2 digit number");
            }
        }
        else{
            System.out.println("number is not a 2 digit number");
        }
    }
}
