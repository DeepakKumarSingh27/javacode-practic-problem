package com.company;

import java.util.Scanner;

//24.Wajp to read and print 4 sub marks of a student and print his result either fail or pass based on marks.
public class program_23 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first subject");
        int hindi=sc.nextInt();
        System.out.println("Enter the second subject");
        int eng=sc.nextInt();
        System.out.println("Enter the third subject");
        int san=sc.nextInt();
        System.out.println("Enter the fourth subject");
        int math=sc.nextInt();
        if (hindi<30 || eng<30 || san<30 || math<30){
            System.out.println("fail");
        }
        else{
            System.out.println("pass");
        }
    }
}
