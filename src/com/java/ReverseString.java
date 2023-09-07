package com.java;

public class ReverseString {

	public static void main(String[] args) {

		/*String orignal = "Hello World..!";
		String reverse = "";

		for (int i = 0; i < orignal.length(); i++) {
			reverse = orignal.charAt(i) + reverse;
		}

		System.out.println(reverse);*/
		
		String ori = "SUMIT";
		String rev = "";
		
		for(int i = 0; i<ori.length(); i++) {
			rev = ori.charAt(i) + rev;
		}
		System.out.println(rev);

	}

}
