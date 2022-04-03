package com.company;

import java.util.Scanner;

//37.Wajp to print the factorial of a no
public class programm_37 {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        int fact=1;
        for(int i=a;i>=1;i--){
            fact*=i;
           // System.out.println(fact);
        }
        System.out.println(fact);
    }
}
