// package dsa;

import java.util.Scanner;

public class BasicProblems4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number: ");
        // int num2 = sc.nextInt();
        // System.out.println("Enter third number: ");
        // int num3 = sc.nextInt();
        // System.out.println("largest number out of all is: " + largestOfThreeNums(num1, num2, num3));
        // System.out.println("smallest number out of all is: " + smallestOfThreeNums(num1, num2, num3));
        // System.out.println("Enter the number to check whether its odd or even: ");
        // System.out.println("Enter your age: ");
        // int num = sc.nextInt();
        // System.out.println(eligibleToVoteOrNot(num));
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        limitPrint(num);
        sc.close();
    }
    
    static int largestOfThreeNums(int num1, int num2, int num3) {
        int max;
        if ((num1 > num2) && (num1 > num3)) {
            max = num1;
        } else if ((num2 > num3) && (num2 > num1)) {
            max = num2;
        } else {
            max = num3;
        }
        return max;
    }
    
    static int smallestOfThreeNums(int num1, int num2, int num3) {
        int min;
        if ((num1 < num2) && (num1 < num3)) {
            min = num1;
        } else if ((num2 < num3) && (num2 < num1)) {
            min = num2;
        } else {
            min = num3;
        }
        return min;
    }
    
    static String oddOrEven(int num) {
        if (num % 2 == 0) {
            return "The given number is even";
        } else {
            return "Its odd";
        }
    }

    static String eligibleToVoteOrNot(int age) {
        if (age < 0) {
            return "Uh-uh-uh thats the wrong number";
        }
        if (age >= 18) {
            return "You're eligible to vote";
        } else {
            return "You're not eligible to vote, wait " + (18 - age) + " more years";
        }
    }

    static void limitPrint(int limit) {
        if (limit > 0) {
            for (int i = 0; i <= limit; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Enter a number greator than 0");
        }
    }
}
