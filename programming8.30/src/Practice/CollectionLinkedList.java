package Practice;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Mon"); //Adding
		ll.add("Tues");
		ll.add("Wed");
		ll.add("Thur");
		ll.add("Fri");
		ll.add("Sat");
		ll.add("Son");
		//retrive through Iterator
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
	}
}
