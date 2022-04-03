package com.company;

import java.util.Scanner;

//27.Wajp to read the month no from the user and print the corresponding month using elseif.
public class programm_27 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month number ");
        int month=sc.nextInt();
        if(month==1){
            System.out.println("january");
        }else if(month==2){
            System.out.println("february");
        }else if(month==3){
            System.out.println("march");
        }
        else if(month==4){
            System.out.println("April");
        }
        else if(month==5){
            System.out.println("may");
        }
        else if(month==6){
            System.out.println("june");
        }
        else if(month==7){
            System.out.println("july");
        }
        else if(month==8){
            System.out.println("August");
        }
        else if(month==9){
            System.out.println("September");
        }else if(month==10){
            System.out.println("October ");
        }else if(month==11) {
            System.out.println("November");
        }
            else if(month==12){
            System.out.println("December");
        }


    }
}
