package com.company;
//13.Write a java program to check user entered no. is even or odd without using ifelse statement,Switch statements. Using Array.
import java.util.Scanner;
public class programm_13 {
    public static void main(String[] args) {
       // int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
       int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Odd numbers:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Even numbers:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
