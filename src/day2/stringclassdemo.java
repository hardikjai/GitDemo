package day2;

public class stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a ="  Hello";
//System.out.println(a.charAt(1));
//System.out.println(a.indexOf("l"));
//System.out.println(a.substring(1, 5));
System.out.println(a.concat(" Rahul Teaches"));
System.out.println(a.trim());
System.out.println(a.toUpperCase());
System.out.println(a.toLowerCase());
String b[]=a.split("e");
System.out.println(b[0]);
System.out.println(b[1]);
 System.out.println(a.replace("e", "a"));
	}
	}


