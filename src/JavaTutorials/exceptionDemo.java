package JavaTutorials;

public class exceptionDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=4;
		int b=7;
		int c=0;
		
		
		try
		{
			
            int arr[]= new int[5];
            
			
				System.out.println(arr[7]);
			
		}
		
		catch(ArithmeticException et) 
		{
			System.out.println("I catched the Arithmetic exception");	
		}
		
		catch(IndexOutOfBoundsException ets) 
		{
			System.out.println("I catched the index out of bound exception");	
		}
		catch(Exception e)
		{
		System.out.println("I catched the error/exception");	
		}
		finally
		{
			System.out.println("Delete cookies");
		}
	}

}
