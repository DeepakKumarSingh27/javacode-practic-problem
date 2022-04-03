package com.company;
//43.Wajp to define a method to check user entered no is perfect no or not.

import java.util.Scanner;
public class program_43 {
    static long perfect(long num){
        long sum=0;
        for(int i=1;i<num;i++){
            if(num % i ==0){
                sum=sum+i; // 1,2,3
            }
        }
        return sum;
    }
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number ");
        long number=sc.nextLong();
        long s=perfect(number);
        if(s==number){
            System.out.println(number +" "+"is perfect Number ");
        }
        else{
            System.out.println(number +" "+ "not a perfect Number ");
        }
    }
}
