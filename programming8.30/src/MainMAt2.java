
public class MainMAt2 {public MainMAt2() {
}public static void main(String[] args) {

	Matrix mt = new Matrix();
	int x[][]=mt.readMAt();
	System.out.println("user entered matrix: ");
	mt.dispMat(x);
	int bg = mt.getBiggest(x);
	System.out.println("Biggest is"+bg);
	int sum=mt.sumOfMat(x);
	System.out.println("sum of matrix elements: "+sum);
}

}
