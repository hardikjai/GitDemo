package JavaTutorials;

import java.util.ArrayList;

public class arrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a= new ArrayList<String>();
		a.add("Rahul");
		a.add("java");
		System.out.println(a);
		a.add(0,"student");
		System.out.println(a);
		/*a.remove(1);
		a.remove("java");
		a.removeAll(a);
		
		System.out.println(a);*/
		System.out.println(a.get(1));
		System.out.println(a.contains("testing"));
		
		System.out.println(a.indexOf("Rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
