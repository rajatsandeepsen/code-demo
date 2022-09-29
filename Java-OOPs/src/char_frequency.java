import java.util.Scanner;

public class char_frequency {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String a = scan.nextLine();
		a=a.toLowerCase();
		
		System.out.println("Enter the character ");
		char x = scan.next().charAt(0);
		int count = 0;
		int len = a.length();
		for (int i=0 ; i<len ; i++)
		{
			if (x == a.charAt(i))
				count++;
		}
		System.out.println("Frequency of the character '" + x + "' in given string is "+ count);  			 
		
	}

}
