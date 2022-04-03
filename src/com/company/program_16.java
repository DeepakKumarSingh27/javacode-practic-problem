package com.company;
//16.Write a java program to read two floating point values from the user and print smallest among those two no by using ifelse.
import java.util.Scanner;
public class program_16 {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        System.out.println("Enter first float number ");
        float f=sc.nextFloat();
        System.out.println("Enter second float number ");
        float f1=sc.nextFloat();
        if(f<f1){
            System.out.println(f+  "it is a small number ");
        }
        else{
            System.out.println(f1+  "it is greater number ");
        }
    }
}
