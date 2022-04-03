package com.company;
//19.Wajp to read principle amount rate of interest and time from user based on that calc n display simple interest.
import java.util.Scanner;
public class program_19 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle");
        float pri=sc.nextFloat();
        System.out.println("Enter the Rate ");
        float rate=sc.nextFloat();
        System.out.println("Time");
        float time =sc.nextFloat();
        float totalamount=pri*rate*time/100;
        System.out.println(totalamount);
    }
}
