import java.util.Scanner;
public class odd_even {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		
		if (x%2==0) {
			System.out.println("its Even");
		}
		else {
			System.out.println("its Odd");
		}
	}

}
