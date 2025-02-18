package com.mycompany.javafullstack.edu;
import java.util.*;
public class vowels {
    public static void main(String[] args) {
       
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the character");
        char m=scanner.next().toLowerCase().charAt(0);
        if(m=='a'||m=='e'||m=='i'||m=='o'||m=='u'){
            System.out.println("Charater is vowel");
        }
        else{
            System.out.println("Charater is not a vowel");
        }
        
        
        
    }
    
}
