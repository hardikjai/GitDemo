package day1;

import day2.CentralTraffic;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.greenGo();
		a.flashYellow();
		
		AustralianTraffic b= new AustralianTraffic();
		b.walkonsymbol();
		ContinentalTraffic c=new AustralianTraffic();
		c.Trainsymbol();
	}
	public void walkonsymbol() 
	{
		System.out.println("walking");
	}

	
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green go implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flash yellow implementation");
	}
	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train");
	}

}
