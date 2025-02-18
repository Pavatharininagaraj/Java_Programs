package com.mycompany.javafullstack.edu;
import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n1=s.nextInt();
        switch (n1%2){
            case 0 -> System.err.println("Even");
            case 1 -> System.err.println("Odd");
            default -> System.out.println("Invalid Input");
            
        }
        
        
    }
    
}
