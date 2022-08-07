package Practice;

import java.util.Iterator;
import java.util.Vector;

public class CollectionVector {
	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		v.add("Mon"); //Adding
		v.add("Tues");
		v.add("Wed");
		v.add("Thur");
		v.add("Fri");
		v.add("Sat");
		v.add("Son");
		//retrive through Iterator
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
	}
}
