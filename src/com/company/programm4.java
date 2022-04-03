package com.company;
//4.Write a java program to print your name and address.
import java.util.Scanner;
public class programm4 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
      String name=sc.nextLine();
        System.out.println("Enter your city name");
        String city=sc.nextLine();
        System.out.println("Enter your pin code");
        int a=sc.nextInt();
        System.out.println("Enter your police station");
        char b =sc.next().charAt(0);
        System.out.println("Enter your mobile number");
        long l=sc.nextLong();
    }
}
