// The "E007a" class.
import java.awt.*;
import hsa.Console;

public class E007a
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int num=100;
	int count=0;
	
	while(num!=0)
	{
	    c.println("Guess the correct number from 0 - 9!");
	    num=c.readInt();
	    c.clear();
	    count=count+1;
	    if(num!=0)
	    {
		c.println("Try again. Enter another number!");
	    }
	    if(num==0)
	    {
		c.println("You guessed the correct number!");
		c.println("It took you "+count+" guesses.");
	    }
	 }
	 
	// Place your program here.  'c' is the output console
    } // main method
} // E007a class
