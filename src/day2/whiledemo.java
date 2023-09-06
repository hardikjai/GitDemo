package day2;

public class whiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int i=0;

while(i<10)
{
	System.out.println(i);
	i++;
	
}*/
		
		/*int i=20;
		do
		{
		i++;	
		}
		while(i<30);
		{
			System.out.println(i);
		}*/
		
		/*for(int i=1;i<=4;i++) 
		{
		System.out.println("outer loop started");
			for(int j=1;j<=4;j++)	
		{
			System.out.println("inner loop");
		}
			System.out.println("outer loop closed");
		}*/
		int k=1;
		for(int i=0;i<=4;i++)
		{
			//System.out.println(" ");
			for(int j=1;j<=4-i;j++)	
		{
			System.out.print(k);
			System.out.print("\t");
			k++;
		}
			System.out.println("");	
			
			
		}
	}

}
