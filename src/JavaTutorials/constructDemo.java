package JavaTutorials;

public class constructDemo {

	public constructDemo()
	{
		System.out.println("I am in the constructor");
	}
	
	public void getData()
	{
		System.out.println("I am the method");
	}
	
	public constructDemo(int a, int b)
	{
		System.out.println("I am in parameterized constructor");
	}
	
	public constructDemo(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructDemo cd = new constructDemo();
		constructDemo c = new constructDemo(4,5);
		constructDemo cds = new constructDemo("hello");
	}

}
