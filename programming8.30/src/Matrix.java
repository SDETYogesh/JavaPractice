import java.util.Scanner;

public class Matrix {
	int[][] readMAt(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the order of mat:");
		int row=sc.nextInt(); //3
		int col = sc.nextInt();//4
		int [][] mat= new int[row][col];
		System.out.print("enter"+row*col+"elements row wise: ");
		int j;
		for(int i = 0; i<mat.length;i++) 
		{
			for(j=0;j<mat[i].length;j++) 
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;

	}
	void dispMat(int[][] mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.println(mat[i][j]+"");
			}
			System.out.println();
		}
	}
	int getBiggest(int[][] mat)
	{
		int big=mat[0][0];
		return big;
	}

	public int sumOfMat(int[][] mat)
	{
		int sum=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				sum=sum+mat[i][j];
			}
		}

		return sum;

	}
}