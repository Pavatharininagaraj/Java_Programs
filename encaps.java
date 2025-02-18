/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javafullstack.edu;

/**
 *
 * @author pavat
 */
class Student {
    private int stuid;
    private String Stuname;
    private float fees;
    
    public int getstuid(){
        return stuid;
    }
    public void setstuid(int stuid){
        this.stuid=stuid;
    }
    public String getStuname(){
        return Stuname;
    }
    public void setStuname(String Stuname){
        this.Stuname=Stuname;
    }    
    
     public float getfees(){
        return fees;
    }
    public void setfees(float fees){
        this.fees=fees;
    }  
    
    @Override
    public String toString(){
        return "encaps[stuid="+stuid+",Stuname="+Stuname+",fees="+fees+"]";
    }
    
    
    
}
public class encaps{
    public static void main(String[] args) {
        Student s=new Student();
        s.setStuname ("Pava");
        s.setstuid(11);
        s.setfees(8975);
        System.out.println("Name="+s.getStuname());
        System.out.println("Id="+s.getstuid());
        System.out.println("Fees="+s.getfees());
        System.out.println(s);
        Student s1=new Student();
        s1.setStuname("Pavatharini");
                s1.setstuid(10);
                        s1.setfees(65757);
                        System.out.println(s1);


    }
}
    