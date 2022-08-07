package Practice;

import java.util.ArrayList;

public class ArrayList01 {
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		food.add("idly");
		food.add("vada");
		food.add("poha");
		food.add("puri");
		food.add("khir");
		food.add("rabdi");
		food.add("peda");
		
		food.set(5, "upma");
		food.remove(0);
		
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}

	}

}
