// The "E007b" class.
import java.awt.*;
import hsa.Console;

public class E007b
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	double sp=127000;
	int weeks=0;
	c.print("House Price",20);
	c.println("Week");
	
	    while(sp>96000)
	    {
		c.print("$");
		c.print(sp,10,2);
		c.println(weeks,11);
		weeks=weeks+1;
		sp=sp*0.95;
	    }
	    c.print("$");
	    c.print(sp,10,2);
	    c.println(weeks,11);
	
	// Place your program here.  'c' is the output console
    } // main method
} // E007b class
