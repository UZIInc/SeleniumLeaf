package cesit;

public class Append {

	public static void main(String args[]) {
		
		//The append() method concatenates the given argument with this string.
		
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println("The Append String is " +sb);// prints Hello Java
		
		//The insert() method inserts the given string with this string at the given position.
		
		StringBuffer sb1=new StringBuffer("Hello ");  
		sb1.insert(2,"Java");//now original string is changed  
		System.out.println("The Inserted String is " +sb1);//prints HJavaello  
		
		//The replace() method replaces the given string from the specified beginIndex and endIndex.
		
		StringBuffer sb2=new StringBuffer("Hello");  
		sb2.replace(2,4,"Java");  
		System.out.println("The Replaced String is " +sb2);//prints HJavalo 
		
		//The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
		
		StringBuffer sb3=new StringBuffer("Hello");  
		sb3.delete(1,3);  
		System.out.println("The Deleted String is " +sb3);//prints Hlo  
		
		//The reverse() method of StringBuilder class reverses the current string.
		
		StringBuffer sb4=new StringBuffer("Hello");  
		sb4.reverse();  
		System.out.println("The Reversed String is " +sb4);//prints olleH  
	}
}
