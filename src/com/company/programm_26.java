package com.company;
        import java.util.Random;
        import java.util.Scanner;

//26.Wajp to design guess game within two/the range.
public class programm_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("guess the  number between 0 to 9");
        int un=sc.nextInt();
        Random rn=new Random(10);
        int vn=rn.nextInt();
        if(un==vn){
            System.out.println("you win the game");
        }
        else{
            System.out.println("you lost the game"+vn);
        }
    }
}

