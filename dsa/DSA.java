// package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class DSA {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int[] arr = {2, 5, 6, 77, 88, 44, 100, 2};
	    reverse(arr);
	    System.out.println(Arrays.toString(arr));
		in.close();
		
}
    //program for reversing an array
	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	 
   
}
