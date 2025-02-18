
package com.mycompany.javafullstack.edu;


public class blocks {
    static{
        System.out.println("static block");

        System.out.println("Anonymous block is executed before the constructor");
      
    }
    blocks(){
        System.out.println("executes the constructor after the object is created");
    
}
    public static void main(String[] args) {
        System.out.println("main method");
        blocks b=new blocks();
        System.out.println(b);
        
    }
    
}
