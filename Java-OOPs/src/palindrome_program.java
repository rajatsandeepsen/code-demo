import java.util.Scanner;

public class palindrome_program {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int orginal = num;
		
		int reverse=0,x;
		while (num != 0) {
			x = num % 10;
			reverse= (reverse * 10) + x;
			
			num = num / 10;
		}
		
		if (reverse == orginal) {
			System.out.println("its a Palindrome!");
		}
		else {
			System.out.println("its not a Palindrome!");
		}
		
	}

}
