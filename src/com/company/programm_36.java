package com.company;

import java.util.Scanner;

//36.Wajp to display the multiplication table for user entered no
public class programm_36 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the multiplication you want");
        int table=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(table*i);
        }
    }
}
