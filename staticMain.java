//Ass 2, Q.3
import java.io.*;

 class StaticDemo {
    
    static int count = 0;
    
    
    static {
        System.out.println("Static block executed!");
        count = 10;
    }
    
    
    static void displayCount() {
        System.out.println("Count: " + count);
    }
    
    
    StaticDemo() {
        count++;
    }
 }
    class staticMain 
	{
    public static void main(String[] args) 
	{
        System.out.println("Main method started");
        
        StaticDemo.displayCount();
      
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        
        StaticDemo.displayCount();
    }
}
/*Output:
Main method started
Static block executed!
Count: 10
Count: 12*/
