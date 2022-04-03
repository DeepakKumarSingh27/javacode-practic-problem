package com.company;
//18.Wajp to read radius of a circle and print area and circumference of the circle.
import java.util.Scanner;
public class program_18 {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius");
        float r=sc.nextFloat();
        double area =Math.PI*r*r;
        System.out.println(area);
        double circumference=2*Math.PI*r;
        System.out.println(circumference);
    }
}
