package com.company;

import java.util.Scanner;

//25.Wajp to check user entered year is leap year or not.
public class program_25 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if((year %400==0) ||(year %4==0 && year % 100!=0)){
            System.out.println(year+" "+"is leap ");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
