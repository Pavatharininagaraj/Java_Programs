package com.mycompany.javafullstack.edu;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        int a[]=new int[5];
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array elements");
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Array elements are");
               for(int i=0;i<5;i++){

            System.out.println(a[i]);
        }
               for(int i=0;i<5;i++){
                   sum=a[i]+sum;}
                   System.out.println("sum: "+sum);
               float avg=(float)sum/a.length; {
                   System.out.println("average:"+avg);}
               int min=a[0];
               for(int i=0;i<a.length;i++){
                   if(a[i]<min)
                       min=a[i];
               }
               System.out.println("Minimum: "+min);
               int max=a[0];
               for(int i=0;i<a.length;i++){
                   if(a[i]>max)
                       max=a[i];
               }
               System.out.println("Maximum: "+max);
               
    
}}
