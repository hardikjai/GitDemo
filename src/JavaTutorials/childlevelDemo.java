package JavaTutorials;

public class childlevelDemo {

	public void getData(int a) 
	{
		System.out.println(a);
	}
	
	public void getData(String b) 
	{
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childlevelDemo cl = new childlevelDemo();
		cl.getData(2);
		cl.getData("hello");
	}

}
