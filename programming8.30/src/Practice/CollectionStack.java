package Practice;

import java.util.Iterator;
import java.util.Stack;

public class CollectionStack {
public static void main(String[] args) {
	Stack<String> st = new Stack<String>();
	st.push("max");
	st.push("Steve");
	st.push("Tom");
	st.pop();
	st.push("smith");
	st.push("willam");
	
	
	Iterator<String> itr = st.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
}}
