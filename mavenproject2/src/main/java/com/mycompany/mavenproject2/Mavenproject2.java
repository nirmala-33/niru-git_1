package com.mycompany.mavenproject2;
import java.util.Scanner;
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner add=new Scanner (System.in);
        System.out.println("enter first number");
        int a=add.nextInt();
        System.out.println("enter second number");
        int b=add.nextInt();
        System.out.println(" result is "+(a+b));
    }
}
