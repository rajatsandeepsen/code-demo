import java.util.Scanner;
	
public class second_program {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name=x.next();
		
		System.out.println("Enter your age ");
		int n=x.nextInt();
		
		System.out.println("Name " + name + " age " + n);
	}

}
