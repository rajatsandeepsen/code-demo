package dsa;

import java.util.Scanner;

public class BasicProblems2 {
    public static void main(String[] args) {
        // System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the principal: ");
        // double principal = sc.nextDouble();
        // System.out.print("Enter the time: ");
        // double time = sc.nextDouble();
        // System.out.print("Enter the rate: ");
        // double rate = sc.nextDouble();
        // double si = simpleInterest(principal, time, rate);
        // System.out.print("Enter two numbers: ");
        // double num1 = sc.nextDouble();
        // double num2 = sc.nextDouble();
        // System.out.print("Enter an operator: ");
        // char op = sc.next().charAt(0);
        // int num = sc.nextInt();
        // double calc = simpleCalculator(num1, num2, op);
        // System.out.println(calc);
        // System.out.print("Enter two numbers : ");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // String biggest = findTheLargest(num1, num2);
        // System.out.println(biggest);
        // System.out.print("Enter INR rupee: ");
        // double inr = sc.nextDouble();
        // double convertedUSD = inrToUSD(inr);
        // System.out.println(convertedUSD);
        // System.out.println("This is the USD for the entered INR");
        // System.out.print("Enter the limiting number for calculating fibonacci series: ");
        // int limit = sc.nextInt();
        // fibonacciSeries(limit);
        // System.out.print("Enter a word to find its palindrome or not: ");
        // String word = sc.next();
        // String pal = palindrome(word);
        // System.out.println(pal);
        System.out.println("Program to find the amstrong numbers in a series");
        System.out.print("Enter a starting number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter an ending number: ");
        int n2 = sc.nextInt();
        // System.out.println(isAmstrong(num));
        for (int i = n1; i <= n2; i++) {
            if (isAmstrong(i) == true) {
                System.out.print(i + " ");
            }
        }
        sc.close();

    }

    // program to find the given number is odd or even
    static String oddOrEven(int num) {
        if (num % 2 == 0) {
            return "The given number is even";
        } else {
            return "The given number is odd";
        }
    }

    // program to greet a user can do it also as a void method
    static String greeting(String name) {
        return "Hey there " + name;
    }

    // method to find simple interest
    static double simpleInterest(double principal, double time, double rate) {
        double si = principal * time * rate;
        System.out.println("Your simple interest is: " + si);
        return si;
    }

    // simple calculator
    static double simpleCalculator(double num1, double num2, char op) {
        if (op == '+') {
            return num1 + num2;
        } else if (op == '-') {
            return num1 - num2;
        } else if (op == '*') {
            return num1 * num2;
        } else if (op == '/') {
            return num1 / num2;
        } else
            return -1;
    }
    
    //finding largest number in 2 numbers
    static String findTheLargest(int num1, int num2) {
        if (num1 > num2) {
            return num1 + " Is the biggest";
        } else if (num2 > num1) {
            return num2 + " Is the biggest";
        } else if (num1 == num2) {
            return "Both are same wtf?";
        } else {
            return "Bruh";
        }
    }


    //INR to USD convertor
    static double inrToUSD(double inr) {
        double usd = 81.63;
        double convertor = inr / usd;
        return convertor;
    }


    //program to find fibonacci series upto n numbers
    static void fibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int count = 0;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.println(b);
            count++;
        }

    }
    
    //to find a given string is palindrome or not
    static String palindrome(String str) {
        char[] ch = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        if (rev.equals(str)) {
            return "Entered word is a palindrome";
        } else {
            return "Its not palindrome";
        }
    }

    //find amstrong numbers upto n numbers
    static boolean isAmstrong(int n) {
        int input = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n /= 10;
        }

        return sum == input;
    }
}
