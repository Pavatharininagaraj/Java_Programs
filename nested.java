
package com.mycompany.javafullstack.edu;

public class nested {
    public static void main(String[] args) {
        int i,j ;
        /*printing as 12345
                      1234
                      123
                      12
                      1
                      
                      
        */
       
       for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                
                System.out.println(j+" ");
            }
        System.out.println(" ");
        }
       
       /*printing * in *****
                       ****
                       ***
                       **
                       * */
        
        /*for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                
                System.out.println("*");
            }
        System.out.println(" ");
        }*/
        
        
    }
    
}
