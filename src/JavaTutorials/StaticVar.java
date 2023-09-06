package JavaTutorials;

public class StaticVar {

	String name;
	String address;
	static String city;
	static int i;
	static 
	{
		city= "bangalore";
		i= 0;
	}
	
	StaticVar(String name,String address)
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
		
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("bob","magholi");
		StaticVar obj1 = new StaticVar("ram","jayanagar");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();
		StaticVar.i=4;
	}

}
