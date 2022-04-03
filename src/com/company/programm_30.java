package com.company;

import java.util.Scanner;

//30.Wajp to read 4 sub marks of a student based on that print his result distinction first class sec class pass or fail.48<
public class programm_30 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the math marks");
        int math=sc.nextInt();
        System.out.println("Enter the sanskrit");
        int san=sc.nextInt();
        System.out.println("Enter the English");
        int eng=sc.nextInt();
        System.out.println("Enter the computer ");
        int com=sc.nextInt();
        if(math>75 && san>75 && eng>75 && com>75){
          System.out.println("Distinction");
        }
        else if(math>60 && san>60 && eng>60 && com>60){
          System.out.println("first class pass");
        }
        else if(math>30 || san>30 || eng>30 || com>30){
          System.out.println("Second  class pass");
        }
        else if(math<30 && san<30 && eng<30 && com<30){
          System.out.println("Second  class pass");
        }
    }
}
