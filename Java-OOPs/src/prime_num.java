import java.util.Scanner;

public class prime_num {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int x=scan.nextInt();
		int flag=0;
		for (int i=2; i <= x/2 ; i++) {
			if (x%i==0) {
				flag=1;
				break;
			}
		}
		if (flag==0)
			System.out.println("Its a Prime Number");
		else 
			System.out.println("Its not a Prime Number");
}

}
