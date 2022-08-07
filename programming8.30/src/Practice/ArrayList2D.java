package Practice;

import java.util.ArrayList;

public class ArrayList2D {
	public static void main(String[] args) {
		ArrayList<String> blist = new ArrayList<String>();
		blist.add("tea");
		blist.add("coffee");
		blist.add("juice");
		blist.add("cock");
		blist.add("suda");
		blist.add("wine");
		blist.add("beer");
		blist.add("whisky");
		blist.add("rum");
		
		
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(12);
		ilist.add(15);
		ilist.add(17);
		ilist.add(19);
		ilist.add(21);
		ilist.add(23);
		ilist.add(25);
		ilist.add(27);
		ilist.add(29);
		
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(blist);
		list.add(ilist);
		
		
		System.out.println(list);
		
	}

}
