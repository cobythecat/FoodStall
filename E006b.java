// The "E006b" class.
import java.awt.*;
import hsa.Console;

public class E006b
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	for(int i=1;i<=6;i++)
	{
	    c.print(i+" times table -");
	    for(int j=1;j<=6;j++)
	    {
		int k=i*j;
		c.print(k,2);
		c.print("",6);
	    }
	    c.println();
	}
	
	// Place your program here.  'c' is the output console
    } // main method
} // E006b class
