package cesit;

public class Application {
    public static void main( String[] args )
    {
        System.out.println( "In JVM called main method" );
        System.out.println("Before calling overloaded main method");
        System.out.println("Result of calling overloaded main method from JVM called" + 
           "main method:"+main(10,20));
    }
    public static int main(int a,int b){
        System.out.println( "In overloaded main method" );
        return a + b;
    }
}