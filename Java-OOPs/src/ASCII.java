import java.util.Scanner;
public class ASCII {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Character");
		char c = scan.next().charAt(0);
		
		int as_chi=c;
		System.out.println("Equal ASCII " + as_chi);
		
	}
}
