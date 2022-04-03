package com.company;

import java.util.Scanner;

//34.Wajp to count how many digits present in a no.
public class programm_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int digit = sc.nextInt();
        int count = 0;
        while (digit != 0) {
          digit/=10;
          count++;
        }
        System.out.println("number of digit is"+ " "+count);
    }
}
