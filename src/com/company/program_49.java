package com.company;

import java.util.Scanner;

//49.wajp to define a method to return sum of n natural no
public class program_49 {
    public static int natural(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=natural(a);
        System.out.println(b);
    }
}
