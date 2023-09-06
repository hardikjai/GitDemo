package JavaTutorials;

public class childDemo extends parentDemo {

	
	public childDemo()
	{
		super();
		System.out.println("I am in child constructor");
	}
	String name = "QAchildAcademy";
	
	public void getStringData() 
	{
		
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childDemo cd = new childDemo();
		cd.getStringData();
		cd.getData();
	}

}
