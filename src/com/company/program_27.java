package com.company;

import java.util.Scanner;

//28.Wajp to read month no from the user and print how many days in that month if 2 print 28,29
public class program_27 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month no");
    int monthno=sc.nextInt();
    switch(monthno){
        case 1:
            System.out.println("in january 31 days ");
            break;
            case 2:
            System.out.println("in february 28 or 29 days ");
            break;
            case 3:
            System.out.println("in march 31 days ");
            break;
            case 4:
            System.out.println("in April 30 days ");
            break;
            case 5:
            System.out.println("in may 31 days ");
            break;
            case 6:
            System.out.println("in june 30 days ");
            break;
            case 7:
            System.out.println("in july 31 days ");
            break;
            case 8:
            System.out.println("in August 31 days ");
            break;
            case 9:
            System.out.println("in September 30 days ");
            break;
            case 10:
            System.out.println("in  October 31 days ");
            break;
            case 11:
            System.out.println("in November 30days ");
            break;
            case 12:
            System.out.println("in December 31 days ");
            break;
    }
    }
}
