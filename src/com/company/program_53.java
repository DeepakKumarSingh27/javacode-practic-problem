package com.company;

import java.util.Scanner;

//53.Wajp to define a method to return n^p
public class program_53 {
    public static int power(int a,int b){
        int result=1;
        for(int i=0;i<b;i++){
            result *=a;
        }
        return result;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        int x=sc.nextInt();
        System.out.println("Enter the second value");
        int y=sc.nextInt();
        int z=power(x,y);
        System.out.println(z);
    }
}
