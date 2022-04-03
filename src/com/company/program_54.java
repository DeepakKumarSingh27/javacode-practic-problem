package com.company;

import java.util.Scanner;

//54.Wajp to define a method to check the no is strong or not
public class program_54 {
    public static int fac(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int sum=0,n1=n;
        while(n!=0){
         int d=n%10;
         sum=sum+fac(d);
         n=n/10;
        }
        if(sum==n1){
            System.out.println("strong number");
        }
        else{
            System.out.println("Not a strong Number");
        }
    }
}
