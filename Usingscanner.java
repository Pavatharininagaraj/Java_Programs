package com.mycompany.javafullstack.edu;
import java.util.*;
public class Usingscanner {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the student reg. no:");
        int regno=scanner.nextInt();
        System.out.println("Enter the student name");
        String name= scanner.next();
        System.out.println("Enter the student fees");
        float fees =scanner.nextFloat();
        System.out.println("Enter the student Gender");
        char gender =scanner.next().charAt(0);
        System.out.println("studentid:"+regno);
        System.out.println("studentname:"+name);
        System.out.println("studentfees:"+fees);
        System.out.println("studentfees:"+gender);
      
    }
}
