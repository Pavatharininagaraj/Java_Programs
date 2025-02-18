/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javafullstack.edu;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {


	public static void main(String[] args) {
		// TODO Auto-generated method stubint a[]=new int[5];
		int key, pos=0;
		int a[]=new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements"); //2 5 3 9 3
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the search element"); //key=8
		key = sc.nextInt();
		
		Arrays.sort(a);
		
		System.out.println("After sorting array elements are ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//1 4 6 7 8
		//l=0 m   h=4
		     // l=mid+1
		int mid;
		int l=0;
		int  h=a.length-1;
		
		while(l<=h) {
			mid=(l+h)/2;
			//1 condition
			if(key==a[mid]) {
				pos=mid+1;
				break;
			}else if(key>a[mid]) {
				l=mid+1;
			}else if(key<a[mid]) {
				h=mid-1;
			}
			
		}
		
		if(pos>0) {
			System.out.println("Successful search");
			System.out.println(key+" element found at position "+pos);
		}else {
			System.out.println("Unsuccessful");
			System.out.println(key+" not found");
		}


	}


}

