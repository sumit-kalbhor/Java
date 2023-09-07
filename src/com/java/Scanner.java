/**
 * 
 */
package com.java;

/**
 * @author skalbhor
 *
 */
public class Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		/*
		 * int a, b, c;
		 * 
		 * System.out.println("Enter a numbers:"); a = sc.nextInt(); b = sc.nextInt(); c
		 * = a + b; System.out.println("Sum is : " + c);
		 */

		String name;
		System.out.println("Enter a name: ");
		name = sc.nextLine();
		System.out.println("Hello..! Welcome " + name);

	}

}
