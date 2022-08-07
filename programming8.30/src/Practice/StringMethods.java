package Practice;

public class StringMethods{
	public static void main(String[] args) {
		String name ="Yogi";
		 boolean result= name.equalsIgnoreCase("yog");
		 System.out.println(result);
		 int r = name.charAt(0);
		 System.out.println(r);
		 int r1= name.indexOf("o");
		 System.out.println(r1);
		 boolean r3= name.isEmpty();
		 int i=Boolean.compare(result, r3);	 
				 if(i==0) {
					 System.out.println("result is empty"); 
		 }
				 else
					 System.out.println("Result is not empty");
				 
				 String r4=name.toUpperCase();
				 System.out.println(r4);
				 
				 String r5 = name.trim();
				 System.out.println(r5);
				 
				 String r6 = name.replace('i', 'a');
				 System.out.println(r6);
	}

}
