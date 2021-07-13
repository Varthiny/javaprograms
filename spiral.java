import java.util.Scanner;
public class spiral {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("JAVA SPIRAL PATTERN");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dimension of matrix :");
		int n = sc.nextInt();
		
		int [] []M = new int [n] [n];
		
		int i = 1;//printing variable
		int mR = 0, mC = 0, MR = n-1, MC = n-1;
		while (i <= (n*n))
		{
			// one cycle here
			
			for (int j = mC; j <= MC; j++) //Left to right operation
				M[mR][j]  = i++;
			for (int j = mR+1; j <= MR; j++) // Top to bottom operation
				M[j][MC] = i++;
			for (int j = MC-1; j >= mC; j--) // Right to left operation
				M[MR][j] = i++;
			for (int j = MR-1; j >= mR+1; j--) // Bottom to top operation
				M[j][mC] = i++;
			
			// update pointers
			mC++; mR++; MC--; MR--;
		}
			
			for(i = 0; i < n; i++)
			{
				for(int j=0; j < n; j++)
					System.out.print(M[i][j] + "\t");
				System.out.println();
			}	
	}}

		
		

