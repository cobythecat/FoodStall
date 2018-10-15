// The "D006" class.
import java.awt.*;
import hsa.Console;

public class D006
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.drawRect(100,100,400,200);
	c.setColor(Color.red);
	c.fillMapleLeaf(225,125,150,150);
	c.fillRect(100,100,100,200);
	c.fillRect(400,100,100,200);
	
	// Place your program here.  'c' is the output console
    } // main method
} // D006 class
