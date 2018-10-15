// The "E004" class.
import java.awt.*;
import hsa.Console;

public class E004
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int i=45;
	    for (int j=10;j<=50;j+=5)
	    {
	    i=i+25;
	    int k=j-5;
	    c.drawOval(j,k,i,i);
	    }   
	
	// Place your program here.  'c' is the output console
    } // main method
} // E004 class
