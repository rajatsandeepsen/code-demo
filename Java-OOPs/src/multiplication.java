// prithviraj undakkitha (run cheyuvo?.... no idea)
import java.util.Scanner;
public class matrix_multi {

	public static void main(String[] args) {
		int row1,col1,row2,col2;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter array and column size of matrix 1\n");
		row1 = scan.nextInt();
		col1 = scan.nextInt();
		System.out.println("Enter array and column size of matrix 2\n");
		row2 = scan.nextInt();
		col2 = scan.nextInt();
		if (row1 == col2) {
			int mat1[][] = new int[row1][col1];
			int mat2[][] = new int[row2][col2];
			int mat3[][] = new int[row1][col2];

			int i,j,k;

			System.out.println("Enter elements of Matrix 1\n");
			for (i=0; i<row1; i++) {
				for(j=0; j<col1; j++) {
						mat1[i][j]=scan.nextInt();
				}
			}
			System.out.println("Enter elements of Matrix 2\n");
			for (i=0; i<row2; i++) {
				for(j=0; j<col2; j++) {
					mat2[i][j]=scan.nextInt();
				}
			}
			for (i=0; i<row1; i++) {
				for(j=0; j<col2; j++) {
					mat3[i][j] = 0;
					for(k=0; k<col1; k++) {
							mat3[i][j] += mat1[i][k] * mat2[k][j];
					}
				}
			}

			System.out.println("The product of 2 matrices is:\n");
			for(i=0; i<row1; i++) {
				for(j=0; j<col2; j++) {
					System.out.println("\t" + mat3[i][j]);
				}
				System.out.println("\n");
				}
			}
			
		else {
			System.out.println("Product cannot be found Matrix order error");
		}
	}
}
