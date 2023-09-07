package com.java;
import java.util.*;
public class EvenOrOdd {

	public static void main(String[] args) {
		
		
		java.util.Scanner sc = new 	java.util.Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even.");
		}else {
			System.out.println("Number is odd");
		}

	}

}
