import java.util.Scanner;
public class matrix_multi {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int ROW1, COL1, ROW2, COL2;

		System.out.print("Enter ROW and COLUMN for First Matrix\n");
		ROW1 = scan.nextInt();
		COL1 = scan.nextInt();
		
		System.out.print("Enter ROW and COLUMN for Second Matrix\n");
		ROW2 = scan.nextInt();
		COL2 = scan.nextInt();
		
		int M1[][] = new int[ROW1][COL1];
		int M2[][] = new int[ROW2][COL2];
		int RESULT[][] = new int[ROW1][COL2];
		int i,j,k;

		if (ROW1 == COL2) {
			System.out.print("Enter elements of Matrix 1\n");
			for (i = 0; i < ROW1; i++) {
				for(j = 0; j < COL1; j++) {
					M1[i][j] = scan.nextInt();
				}
			}
			System.out.print("Enter elements of Matrix 2\n");
			for (i = 0; i < ROW2; i++) {
				for(j = 0; j < COL2; j++) {
					M2[i][j] = scan.nextInt();
				}
			}
			for (i = 0; i < ROW1; i++) {
				for(j = 0; j < COL2; j++) {
					for(k = 0; k < COL1; k++) {
						RESULT[i][j] = M1[i][k] * M2[k][j];
					}
				}
			}

			System.out.print("Result of Multiplication of two Matrix:\n");
			for(i = 0; i < ROW1; i++) {
				for(j = 0; j < COL2; j++) {
					System.out.print("\t" + RESULT[i][j]);
				}
				System.out.print("\n");
			}
		}
		else {
			System.out.print("Matrix Multiplication is Impossible");
		}
	}
}
