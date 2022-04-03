package com.company;
import java.util.Scanner;
//22.Wajp to read any 3 integer no n find the biggest among those 3.
public class program_22 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a=sc.nextInt();
        System.out.println("Enter the second Number");
        int b=sc.nextInt();
        System.out.println("Enter the third Number ");
        int c=sc.nextInt();
        int result=(a>b && a>c)?a:(b>c)?b:c;
        System.out.println(result +" "+"is Greater number");
    }
}
