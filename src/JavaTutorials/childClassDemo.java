package JavaTutorials;

public class childClassDemo extends parentClassDemo {
	
	public void engine() 
	{
		System.out.println("new engine");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}
	
	public void audioSystem()
	{
		System.out.println("new child audio");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		childClassDemo cd = new childClassDemo();
		cd.colour();
		cd.engine();
		cd.Gear();
		cd.Brakes();
		cd.audioSystem();
	}

}
