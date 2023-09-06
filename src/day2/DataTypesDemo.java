package day2;

public class DataTypesDemo {
	
	int a=5;
	//methods
	public void getData()
	{
		System.out.println("I am in method");
		//return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataTypesDemo fn = new DataTypesDemo();
		fn.getData();
		System.out.println(fn.a);
		secondclass sn =new secondclass();
		sn.setData();
//int a;
//a=100;
//System.out.println("Welcome");
		
		//int a=100, b=200, c= 300;
		//System.out.println("The value of a is"+a);
		//System.out.println("The value of b is"+b);
		//System.out.println("The value of c is"+c);
		//System.out.println(a+ " " + b+" " +c);
		
	}

}
