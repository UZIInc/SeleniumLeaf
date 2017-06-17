package cesit;

public class SubClass extends SuperClass {
    public void printHello() {
 
     super.printHello();
       System.out.println("Hello from SubClass");
       
    }
    public static void main(String[] args) {
       SubClass obj = new SubClass();
       obj.printHello();
   }
}