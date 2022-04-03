package com.company;

import java.util.Scanner;

//51.wajp to define a method to return biggest among 3 no
public class program_51 {
    public static int biggest(int a,int b,int c){
        int maxOf=a>b?a>c?a:c:b>c?b:c;
        return maxOf;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int x=sc.nextInt();
        System.out.println("Enter the second Number");
        int y= sc.nextInt();
        System.out.println("Enter the third Number");
        int z=sc.nextInt();
        int p=biggest(x,y,z);
        System.out.println(p+" "+"is the Biggest Number");
    }
}
