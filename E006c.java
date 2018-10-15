// The "E006c" class.
import java.awt.*;
import hsa.Console;

public class E006c
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	for(int i=1;i<=5;i++)
	{
	    for(int j=1;j<=5;j++)
	    {
		if(j<=i)
		{
		    c.print("*");
		}
	    }
	    c.println();
	}
	
	// Place your program here.  'c' is the output console
    } // main method
} // E006c class
