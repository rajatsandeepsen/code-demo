import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int x=scan.nextInt();
		int sum=1;
		for (int i=1; i <= x ; i++) {
				sum*=i;
		}
		System.out.println("Factorial is "+ sum);
	}

}
