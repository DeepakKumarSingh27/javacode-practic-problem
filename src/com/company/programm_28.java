package com.company;
//29.Wajp to check user Entered no is digit or number
import java.util.Scanner;
public class programm_28 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        if(a>9){
            System.out.println("it is Number ");
        }
        else{
            System.out.println("it is Digit");
        }
    }
}
