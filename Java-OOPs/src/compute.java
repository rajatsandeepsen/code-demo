import java.util.Scanner;

public class compute {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		System.out.println("Sum is " + (x+y));
		System.out.println("Difference is " + (x-y));
		System.out.println("Product is " + (x*y));
		System.out.println("Division is " + ((float)x/y));

	}

}
