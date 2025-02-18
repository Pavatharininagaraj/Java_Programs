
package com.mycompany.javafullstack.edu;

import java.util.LinkedHashMap;
import java.util.Map;


public class hash {


	public static void main(String[] args) {
             String s="hello";
             //h->1
             //e->1
             //l->2
             //o->1
          //convert String to character array
           char ch[]=s.toCharArray();
                      //{'h','e','l','l','o'}
           
         LinkedHashMap<Character, Integer>lhmap =new LinkedHashMap<>();
         //System.out.println(lhmap);
         
         for(char c:ch) {
        	// i++;
        	 lhmap.put(c, lhmap.getOrDefault(c,0)+1);
        	// System.out.println(lhmap);
         }
        // System.out.println(lhmap);
         
         for(Map.Entry<Character, Integer> lobj:lhmap.entrySet()) {
        	 System.out.println(lobj.getKey()+"->"+lobj.getValue());
        	 
       }
           
   }


}
