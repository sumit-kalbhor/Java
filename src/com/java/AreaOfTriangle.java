package com.java;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		int b ; //base
        int h; //height
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base : ");
        b = sc.nextInt();
        System.out.println("Enter a height: ");
        h = sc.nextInt();
        
        int area = (b* h)/2;  
        
        System.out.println("Area of triangle is : " + area);
	}

}
