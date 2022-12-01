// package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class BasicProblems {
	public static void main(String[] args) {
		// System.out.print("Enter the year which do you want to check if its leap year
		// or not: ");
		// System.out.println("Enter two numbers: ");
		// System.out.print("Enter a number for the multiplication table: ");
		Scanner scan = new Scanner(System.in);
		int[] elements = { 2, 3, 5, 3, 5, 2, 7, 8, 8, 1, 1, 1, 10 };
		int[] arr = { 1, 1, 2, 2, 3 };

		// int a = 10;
		// int b = 5;
		// swap without temp
		// b = b + a;
		// a = b - a;
		// b = b - a

		hashSet(elements);
		// uniqueElem(elements);
		// uniqueElementHashMap();
		// uniqueElement(elements);
		// unique(arr);
		// int num = in.nextInt();
		// int num2 = in.nextInt();
		// int year = in.nextInt();
		// System.out.println(leapYearOrNot(year));
		// System.out.println(twoSum(num1, num2));

		// program which adds all the numbers which user enters and adds it but exit
		// when user press "X" or any other charector
		// int sum = 0;
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Enter a number to start");
		// while (scan.hasNext()) {

		// if (scan.hasNextInt()) {
		// System.out.print("Enter a number: ");
		// sum += scan.nextInt();
		// } else if (scan.equals("X")) {
		// break;
		// } else {
		// System.out.println("Program crashed!");
		// break;
		// }

		// System.out.println("Sum is now: " + sum);
		// }

		// System.out.println("Your sum is: " + sum);

		// System.out.println("END");

		// multiTable(num);
		scan.close();

	}

	// program to find if the given year is leap or not
	static String leapYearOrNot(int year) {
		if (year % 400 == 0 || year % 4 == 0) {
			return "Year " + year + " Is a leap year";
		} else {
			return "Not a leap year";
		}
	}

	// finding the sum of two numbers
	static int twoSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	// multiplication table of the entered number.
	static void multiTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + num + " = " + i * num);
		}
	}

	static void uniqueElem(int[] elements) {

		// this method will only work if there's only one unique element.
		// this method can only be used if the repeating element's frequency is equal to
		// each other.
		int ans = elements[0];

		for (int i = 1; i < elements.length; i++) {
			ans ^= elements[i];
		}

		// or
		// int res = 0;

		// for (int i = 0; i < elements.length; i++) {
		// res ^= elements[i];
		// }

		// any ways its the same time and space complexity

		System.out.println("The ans is " + ans);

	}

	static void uniqueElement(int[] arr) {
		// this method will work in both sorted and non-sorted array
		// but the time complexity is O(n^2) which is bad.
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1)
				System.out.println("unique element : " + arr[i]);
		}
	}

	static void unique(int[] arr) {
		// this method can only be used if the repeating element's frequency is 2
		// and the array should be sorted. If you get a sorted array. Its better to do
		// binary search.
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i += 2) {
			if (arr[i] != arr[i + 1]) {
				System.out.println(arr[i]);
			} else if (arr[arr.length - 1] != arr[arr.length - 2]) {
				System.out.println(arr[arr.length - 1]);
				break;
			}
		}
	}

	static void uniqueElementHashMap(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry);
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	static boolean vowelContains(String input) {

		
		

		return input.toLowerCase().matches(".*[aeiou].*");
	}

	static void hashSet(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		System.out.println(set);
	}

}
