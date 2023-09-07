package com.java;

public class Swap {

	public static void main(String[] args) {

     int x = 23;
     int y = 34;
     
     System.out.println("The value of x before swapping:" + x);
     System.out.println("The value of y before swapping:" + y);
		
     
     x = x+y;
     y = x-y;
     x = x-y;
     
     System.out.println("The value of x after swapping:" + x);
     System.out.println("The value of y after swapping:" + y);
		
      
     swap(x,y);
	}
	
	public static void swap(int x, int y) {
		
		 int x1 = 5;
	     int y1 = 7;
	     
	     System.out.println("The value of x before swapping:" + x1);
	     System.out.println("The value of y before swapping:" + y1);
		
		int temp =x1;
		x1=y1;
		y1=temp;
		
	     System.out.println("The value of x after swapping:" + x1);
	     System.out.println("The value of y after swapping:" + y1);
	}

}
