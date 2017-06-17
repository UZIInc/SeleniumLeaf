package day2;

public class PrimeorNot {

	public static void main(String[] args) {
	
		for(int a=35;a<=90;a++)
		{
			boolean c=true;
		for(int b=2;b<a;b++)
			{
				if(a%b==0)
				{
					c=false;
					break;
				}
				
		}
		if(c)
		System.out.println("The Prime Values are: " +a);
			
		}
		

	}

}
