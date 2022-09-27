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
        biggestNumUntilUserPressZero();
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

}
