package com.mycompany.javafullstack.edu;
import java.util.*;
public class Marks {
    public static void main(String[] args) {
        int m;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the marks");
        m=s.nextInt();
        if(m>90&&m>100){
            System.out.println("A grade");
        }
        else if(m>70&&m>80){
            System.out.println("B grade");
        }
        else if(m>50&&m>69){
            System.out.println("C grade");
        }
        else if(m>35&&m>49){
            System.out.println("D grade");
        }
        else{
            System.out.println("Invalid input");
        }
        
                
    }
    
}
