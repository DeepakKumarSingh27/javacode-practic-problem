package com.company;

import java.util.Scanner;

//41.Wajp to reverse the no
public class program_40 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int no=sc.nextInt();
        int rem,rev=0;
        while(no!=0){
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println("Reverse Number is"+" "+rev);
    }
}
