package day2;

public class Fibanocci {

	public static void main(String[] args) {
		
		int x=0,y=1,z=0;
		
		for(int i=1;i<=100;i++)
		{
			z=x+y;
		System.out.println("The Fibanocci values are : "+z);
		x=y;
    	y=z;
			
			
			
			
		}

	}

}
