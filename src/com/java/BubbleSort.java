package com.java;

import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {

     int arr[] = {12,2,33,4,22,7,65,44};
     System.out.println("Elements before sorting : " + Arrays.toString(arr));

     int n = arr.length;
     
     for(int i=0;i<n-1;i++) {
    	 for(int j=0;j<n-1;j++) {
    		 if (arr[j]>arr[j+1]) {
    			 int temp = arr[j];
    			 arr[j]=arr[j+1];
    			 arr[j+1]=temp;
    		 }
    	 }
     }
     System.out.println("Elemets  after sorting :" + Arrays.toString(arr) );
     
	}

}
