// The "D004" class.
import java.awt.*;
import hsa.Console;

public class D004
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.setColor(Color.red);
	c.drawRect(75,75,100,100);
	c.setColor(Color.blue);
	c.drawOval(150,150,120,120);
	c.setColor(Color.green);
	c.drawLine(200,200,300,300);
	c.setColor(Color.yellow);
	c.drawRect(305,305,100,100);
	
	// Place your program here.  'c' is the output console
    } // main method
} // D004 class
