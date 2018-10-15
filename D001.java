// The "D001" class.
import java.awt.*;
import hsa.Console;

public class D001
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.drawLine(200,200,200,100);
	c.drawLine(400,200,400,100);
	c.drawLine(200,200,400,200);
	c.drawLine(200,100,400,100);
	// Place your program here.  'c' is the output console
    } // main method
} // D001 class
