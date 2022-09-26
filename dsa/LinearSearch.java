package dsa;

import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args) {

		// here we're doing linear search in both 1D and 2D arrays

		// int[] arr = {1, 2, 333, 5, 66, 99, 70, 11};
		// int target = 66;
		// System.out.println(linearSearchInteger(arr, target));
		// String name = "Karthik";
		// char target = 'K';
		int[][] arr2D = {
				{ 2, 5, 11, },
				{ 88, 55, 3, 111, 22, 333 },
				{ 66, 90, 14 },
		};
		int[] ans = arraysSearch2D(arr2D, 14);
		System.out.println(Arrays.toString(ans));
	}
    
	//finding a target element in an array
	static int linearSearchInteger(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return arr[i];
			}
		}

		//not a good approaching returning -1, but shit bro lazy af.
		return -1;
	}

	//linear search in a string
	static boolean linearSearchString(String str, char target) {
		if (str.length() == 0) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				return true;
			}
		}
		return false;
	}


	//linear search in a 2D array
	static int[] arraysSearch2D(int[][] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}
}
