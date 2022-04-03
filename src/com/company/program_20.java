package com.company;
//20.Wajp to read the length and breadth of a rectangle based on that calc the area and perimeter of rectangle
import java.util.Scanner;
public class program_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Breadth");
        int b=sc.nextInt();
        System.out.println("Enter the Area");
        int a=sc.nextInt();
        int length=a%b;
        System.out.println(length);
        int breadth=9;
    }
}
