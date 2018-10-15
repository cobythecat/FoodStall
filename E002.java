// The "E002" class.
import java.awt.*;
import hsa.Console;

public class E002
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	for(int i=10;i>=0;i--)
	{
	c.print(i+"...");
	}
	c.print("Liftoff!");
	
	// Place your program here.  'c' is the output console
    } // main method
} // E002 class
