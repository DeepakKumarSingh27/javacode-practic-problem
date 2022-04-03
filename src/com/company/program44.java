package com.company;

import java.util.Scanner;

//44.Wajp to method return true if the no is Palindrome otherwise return false.
public class program44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
    int no=sc.nextInt();
    int temp=no;
    int rev=0,rem;
    while(temp !=0){
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
    }
    if(no==temp){
        System.out.println(no+" "+"Palindrome Number");
    }
    else{
        System.out.println(no+" "+"Palindrome Number");
    }
    }
}
