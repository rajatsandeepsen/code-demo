import java.util.Scanner;
class anyShape{
	double area;

	void findArea(float R){
	area = R * R * 3.14;
	System.out.println("Area of Circle = "+ area);
	}

	void findArea(int L,int W){
	area = L * W;
	System.out.println("Area of Rectangle = "+ area);
	}

	void findArea(float B, float H){
	area = B * H * 0.5;
	System.out.println("Area of Triangle = "+ area);
	}
}

public class area_finder {
	public static void main(String[] args) {
		int length, width;
		float radius, base, height;
		anyShape myShape = new anyShape();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the Radius of Circle");
		radius = scan.nextFloat();
		myShape.findArea(radius);
		
		System.out.println("\nEnter Length of Rectangle");
		length = scan.nextInt();
		System.out.println("Enter Width of Rectangle");
		width = scan.nextInt();
		myShape.findArea(length, width);
		
		System.out.println("\nEnter Base of Triangle");
		base = scan.nextFloat();
		System.out.println("Enter Height of Triangle");
		height = scan.nextFloat();
		myShape.findArea(base, height);
		}
}
