package com.company;
//12.Write a java program to check user entered no. is even or odd without using ifelse and ternary operator. Using Switch statement.
import java.util.Scanner;
public class programm_12 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number's ");
        int a=sc.nextInt();
        switch(a%2){
            case 0:
                System.out.println(a+" "+ "is Even number");
                break;
            case 1:
                System.out.println(a+" "+ "is odd number");
                break;
            default:
                System.out.println("no match case");
        }
    }
}
