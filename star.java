package com.mycompany.javafullstack.edu;
public class star {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=5;i++){
            for(int b=1;b<=row-i;b++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
