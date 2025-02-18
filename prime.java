
package com.mycompany.javafullstack.edu;
public class prime {
    public static void main(String[] args) {
       
        for(int i=2;i<=100;i++){
                    int c=0;

            for(int j=i;j>=1;j--){
                if(i%j==0)
                    c=c+1;
            }
          
            if(c==2){
                System.out.println(i);
            }
                
            }
        }
    }
            