package com.company;
//21.Wajp to read the height and weight (kg , meters) of a person  based on that calc bmi.

import java.util.Scanner;

public class program_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in kilograms ");
        double weight=sc.nextDouble();
        System.out.println("Enter the Height in miters");
        double height=sc.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("person bmi is:"+" "+ bmi+ "kg");
    }
}
