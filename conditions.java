package com.mycompany.javafullstack.edu;
import java.util.*;
/**
 *
 * @author pavat
 */
public class conditions {
    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        a=s.nextInt();
        if(a%10==0){
            System.out.println("even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    
}
