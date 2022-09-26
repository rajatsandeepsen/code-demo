import java.util.Scanner;

public class BasicProblems {
	public static void main(String[] args) {
//		System.out.print("Enter the year which do you want to check if its leap year or not: ");
//		System.out.println("Enter two numbers: ");
//		System.out.print("Enter a number for the multiplication table: ");
		Scanner scan = new Scanner(System.in);
//		int num = in.nextInt();
//		int num2 = in.nextInt();
//		int year = in.nextInt();
//		System.out.println(leapYearOrNot(year));
//		System.out.println(twoSum(num1, num2));
		
		//program which adds all the numbers which user enters and adds it but exit when user press "X" or any other charector
		    int sum = 0;
//		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter a number to start");
		    while (scan.hasNext()) {
		    	
		        if (scan.hasNextInt()) {
		        	System.out.print("Enter a number: ");
		        	sum += scan.nextInt();
		        }
		        else if(scan.equals("X")){
		        	break;
		        }else {
		        	System.out.println("Program crashed!");
		        	break;
		        }

		        System.out.println("Sum is now: " + sum);
		    }
		    
		    System.out.println("Your sum is: " + sum);

		    System.out.println("END");
		
		
		
//		multiTable(num);
		scan.close();
		
	}
	

	//program to find if the given year is leap or not
	static String leapYearOrNot(int year) {
		if (year % 400 == 0 || year % 4 == 0) {
			return "Year " + year + " Is a leap year";
		} else {
			return "Not a leap year";
		}
	}
	
	//finding the sum of two numbers
	static int twoSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	//multiplication table of the entered number.
	static void multiTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + num + " = " + i * num);
		}
	}
}
