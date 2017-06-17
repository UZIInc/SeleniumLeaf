package cesit;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayArrayListExample {
    
    public static void main(String[] args) { 
 
        // ArrayList Example   
  
        ArrayList<String> arrlistobj = new ArrayList<String>();
        arrlistobj.add("Alive is awesome");
        arrlistobj.add("Love yourself");
        Iterator it = arrlistobj.iterator();
        System.out.println("ArrayList object output :");  
        while(it.hasNext())         
          System.out.println(it.next() + " ");
             
          
         
        // Array Example
 
        String[] arrayobj = new String[3];
        arrayobj[0]= "Love yourself";  
        arrayobj[1]= "Alive is awesome";
        arrayobj[2]= "Be in Present"; 
        System.out.println("Array object output :");
        for(int i=0; i < arrayobj.length ;i++)
        System.out.println(arrayobj[i] + " ");   
 
 }
}
