package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollectionArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mon"); //Adding
		list.add("Tues");
		list.add("Wed");
		list.add("Thur");
		list.add("Fri");
		list.add("Sat");
		list.add("Son");
		//retrive through Iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
