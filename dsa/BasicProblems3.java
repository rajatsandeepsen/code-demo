package dsa;

import java.util.Scanner;

public class BasicProblems3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the height of the rectangle: ");
        // int height = sc.nextInt();
        // System.out.print("Enter the width of the rectangle: ");
        // int width = sc.nextInt();
        // System.out.println(areaOfRectangle(height, width));
        // System.out.print("Enter the side of the equi triangle: ");
        // double side = sc.nextDouble();
        // System.out.println(areaOfEquiTriangle(side));
        // System.out.println(2 % 10);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // factorsOfNum(num);
        // int num = sc.nextInt();
        // System.out.println(substractProductAndSum(num));
        // biggestNumUntilUserPressZero();
        // System.out.print("Enter the number to find the factorial: ");
        // int num = sc.nextInt();
        // factorialOfNum(num);
        // System.out.print("Enter the hours: ");
        // double hrs = sc.nextDouble();
        // System.out.print("Enter the watt: ");
        // double watt = sc.nextDouble();
        // electricityBill(hrs, watt);
        // System.out.print("Enter the limiting number to find avg: ");
        // int n = sc.nextInt();
        // avgOfNNumbers(n);
        // System.out.print("Enter a string to reverse it: ");
        // String str = sc.next();
        // System.out.println(reverseString(str));
        // System.out.print("Palindrome num :");
        // int num = sc.nextInt();
        // System.out.println(palindromeNum(num));
        System.out.print("Enter an alphabet: ");
        char input = sc.next().charAt(0);
        vowelsOrConsonants(input);
        sc.close();
    }
    



    //program to find the area of a circle
    static double areaOfCircle(double radius) {
        double pi = Math.PI;
        double rad = pi * (radius * radius);
        return rad;
    }
    
    //program to find the area of a triangle
    static double areaOfTriangle(double base, double height) {
        double area = 0.5 * base * height;
        return area;
    }

    //program to find the area of a rectangle
    static int areaOfRectangle(int height, int width) {
        int area = height * width;
        return area;
    }

    //area of equilatoral triangle 
    static double areaOfEquiTriangle(double side) {
        double area = (Math.sqrt(3) / 4) * side * side;
        return area;
    }

    //leetcode problem "Subtract the Product and Sum of Digits of an Integer"
    static int substractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }

    //factors of a given number
    static void factorsOfNum(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    //finding the biggest number which user enters until he presses 0
    static void biggestNumUntilUserPressZero() {
        Scanner sc = new Scanner(System.in);
        int largestNum = 0;
        System.out.println("Enter Numbers randomly");
        while (sc.nextInt() != 0) {
            largestNum = sc.nextInt();
        }

        System.out.println("Largest number is: " + largestNum);
        sc.close();
    }
    

    //factorial of a number
    static void factorialOfNum(int num) {
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Factorial of the number is :" + factorial);
    }

    //program to calculate monthly electricity bill
    static void electricityBill(double hrs, double watt) {
        double consumedEnergy = hrs * watt;
        double kWh = consumedEnergy / 1000;
        int electricityRateInIndia = 6;
        double electricityBillPerDay = kWh * electricityRateInIndia;
        System.out.println("Your per day electricity bill: " + electricityBillPerDay);
        double monthlyElectricityBill = electricityBillPerDay * 30;
        System.out.println("Electricity bill per month: " + monthlyElectricityBill);
    }

    //average of N numbers
    static void avgOfNNumbers(int n) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        double avg = sum / n;
        System.out.println(avg);
        sc.close();

    }

    //reverse a string
    static String reverseString(String str) {
        char[] arr = str.toCharArray();
        String rev = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            rev += arr[i];
        }

        return rev;
    }

    //palindrome number or not
    static boolean palindromeNum(int num) {
        int input = num;
        int sum = 0;
        int r = 0;

        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num /= 10;
        }

        return input == sum;
    }

    //program to find vowels or consonants
    static void vowelsOrConsonants(char input) {
        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print("Is vowel");
                break;
            default:
                System.out.print("Is consonant");
        }
    }



}
