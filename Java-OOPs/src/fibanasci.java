import java.util.Scanner;
public class fibanasci {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limti of the series");
		int limit=scan.nextInt();
		
			int a=0,b=1,c;
			System.out.println(a + "\n" + b);
			
			for(int i=0; i < limit-2; i++) {
				c=b;
				b=b+a;
				a=c;
				System.out.println(b);
				
			}
	}

}
