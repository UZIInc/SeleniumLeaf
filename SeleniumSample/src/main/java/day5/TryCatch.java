package day5;

public class TryCatch {
	
	 public static void main(String args[]){  
		 
		 try{  
		      int data=50/0;  
		      
		   }catch(Exception e)
		    {
			   System.out.println(e);
			   }  
		 finally {
			 
			 System.out.println("Inside Finally");
			
		}
		    
		}  
		

}
