package com.company;

import java.util.Scanner;

//31.Wajp to print sanju if no is divisible by 3 print geeta if no is divisible by 5 print sanju weds geeta if no is divisible by 3&5 both otherwise breakup.
public class programm_31 {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number ");
  int d=sc.nextInt();
  if(d %3==0){
      System.out.println("geeta");
  }
  else if(d % 5==0){
      System.out.println("sanju");
  }
  else if(d %3==0 && d% 5==0){
      System.out.println("sanju weds geeta");
  }
  else{
      System.out.println("Breakup");
  }
    }
}
