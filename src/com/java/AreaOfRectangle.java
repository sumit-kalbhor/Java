package com.java;

import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int l;
		int w;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length: ");
		l =sc.nextInt();
		System.out.println("Enter a width: ");
		w = sc.nextInt();
	
		
		int area = l*w;
		
		System.out.println("Area of rectangle is : " + area);

	}

}
