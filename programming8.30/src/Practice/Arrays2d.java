package Practice;

public class Arrays2d {
	//2D Arrays
	public static void main(String[] args) {
		String [][] cars = 
			    {
				{"c01","c02","c03"},
				{"c11","c12","c13"},
				{"c21","c22","c23"}
				};
		
		
		
		
		for(int i=0;i<cars.length;i++) 
		{
			System.out.println();
			/* if you put j<= it will throw IndexOutOfBoundException 
			as the the length will become 3 but we only have 0 to 2 values*/			
			for(int j=0;j<cars[i].length;j++)   
			{
				System.out.println(cars[i][j]+"");
			}
		}
		
	}

}
