// The "E007" class.
import java.awt.*;
import hsa.Console;

public class E007
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int num=100;
	
	while(num!=0)
	{
	    c.println("Guess the correct number from 0 - 9!");
	    num=c.readInt();
	    if(num!=0)
	    {
		c.println("Try again. Enter another number!");
	    }
	    if(num==0)
	    {
		c.println("You guessed the correct number!");
	    }
	 }
	
	// Place your program here.  'c' is the output console
    } // main method
} // E007 class
