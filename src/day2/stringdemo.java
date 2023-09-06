package day2;

public class stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a= "hello";
		String b= "hello";
		String c=a.concat("world");
		System.out.println(c);
		String s= new String("hello");
		String s1= new String("hello");
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println(a.equals(s));
		System.out.println(a==s);
		System.out.println(s==s1);
		
		/*StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(2, "she");
		System.out.println(sb);
		sb.replace(5,7,"aa");
		System.out.println(sb);
		sb.deleteCharAt(12);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);*/
		
	}

}
