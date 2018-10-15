// The "D002a" class.
import java.awt.*;
import hsa.Console;

public class D002a
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.drawRect(200,200,200,100);
	c.drawLine(200,300,400,200);
	c.drawLine(200,200,400,300);
	// Place your program here.  'c' is the output console
    } // main method
} // D002a class
