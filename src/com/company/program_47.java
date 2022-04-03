package com.company;

import java.util.Scanner;

//47.wajp to define a method to return reverse of no
public class program_47 {
    public static int reverse(int no){
        int temp=no; //123
        int rev=0,rem;
        while(temp !=0){
            rem=temp%10; //3,2,1
            rev=rev*10+rem; // 3,2,1
            temp=temp/10; //12,1,0
        }
        return  rev;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        int b=reverse(a);
        System.out.println(b);
    }
}
