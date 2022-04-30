import java.util.Scanner;

public class MainMat1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the order of mat:");
		int row=sc.nextInt(); //3
		int col = sc.nextInt();//4
		int [][] mat= new int[row][col];
		System.out.print("enter"+row*col+"elements row wise: ");
		int j;
		for(int i = 0; i<mat.length;i++) //no.of rows
		{
			for(j=0;j<mat[i].length;j++) //no. of cols
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("user entered matrix" );
		for(int i = 0; i<mat.length;i++) {
			for(j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+"");
			}
			System.out.println();
		}

	}
}

