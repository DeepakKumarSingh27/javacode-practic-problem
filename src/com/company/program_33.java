package com.company;

import java.util.Scanner;

//33.Wajp to calc the sum first n natural no.
public class program_33 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Natural Number");
        int a=sc.nextInt();
        int sum=0;
        for(int i=1; i<=a; i++){
            sum+=i;
        }
        System.out.println("sum is"+" "+sum);
    }
}
