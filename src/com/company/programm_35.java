package com.company;

import java.util.Scanner;

//35.Wajp to calc the sum of digits in no.
public class programm_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int digit = sc.nextInt();
        int count = 0;
        int sum=0;
        while (digit != 0) {
            digit/=10;
            count++;
            sum+=count;
        }
        System.out.println("number of digit is"+ " "+count+"  and sum is  "+sum);
    }
}
