import java.util.Scanner;

public class string_palindrome {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String a = scan.nextLine();
		String b = "";
		
		a=a.toLowerCase();
		int x = a.length();
		for (int i=x-1; i>=0 ; i--)
					b = b + a.charAt(i); 
				
		if (a.equals(b))
			System.out.println("its a String Palindrome");
		else
			System.out.println("its not a String Palindrome");
	}

}
