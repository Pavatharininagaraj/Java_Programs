/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javafullstack.edu;
import java.util.*;
/**
 *
 * @author pavat
 */
public class Electricity {
    public static void main(String[] args) {
        int unit;
        
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the name");
        String Name=scanner.next();
        System.out.println("enter the unit");
        unit=scanner.nextInt();
        System.out.println("Name:"+Name);
        System.out.println("Units:"+unit);
        if(unit>0&&unit<=100){
            int rate=unit*2;
            System.out.println("The amount is"+rate);
        }
        else if(unit>100&&unit<=300){
            
                int rate=100*2+(unit-100)*3;
                System.out.println("The amount is"+rate);
            
          
        }
        else{
            float rate=100*2+200*3+(unit-300)*5;
            rate=(float) (rate+2.5/100);
            System.out.println("The amount is"+rate);

        }
        

                        


        
        
  
    }
    
}
