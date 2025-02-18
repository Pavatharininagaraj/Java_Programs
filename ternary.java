package com.mycompany.javafullstack.edu;
import java.util.Scanner;
public class ternary {
    public static void main(String args[]){
        int n1,n2,n3,n4,l;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        n1=s.nextInt();
        n2=s.nextInt();
        n3=s.nextInt();
        n4=s.nextInt();
        /*
        if(n1>n2&&n1>n3){
            System.out.println(n1+"n1 is the largest number");
        }
        else if(n2>n1&&n2>n3){
            System.out.println(n2+"n2 is the largest number");
        }
        else{
            System.out.println(n3+"n3 is the largest number");
        }*/
        
        
     /*   l=(n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
                {
                    System.out.println(l);
                }*/
     
l=(n1>n2&&n1>n3&&n1>n4)?n1:     
        (n2>n1&&n2>n3&&n2>n4)?n2:
                (n3>n1&&n3>n2&&n3>n4)?n3:n4;
     {           
         System.out.println(l+" is the largest number");
     }        
        
    }
    
    
       
}
