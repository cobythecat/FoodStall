// The "FoodStall" class.
import java.awt.*;
import hsa.Console;

public class FoodStall
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	 //Variables
	double t1,t2,coke,chips,Total;
	
	//Input
	c.println("Food Stall");
	c.print("Amount of coke cans: ");
	coke=c.readDouble();
	c.print("Amount of chips: ");
	chips=c.readDouble();
	c.clear();
	
	//Equations 
	coke=(coke*3.00);
	chips=(chips*2.50);
	t1=(coke+chips);
	
	//Total
	c.print("The total is $");
	c.println(t1,0,2);
	c.print("Type in the amount you can pay: ");
	t2=c.readDouble(); 
	c.clear();
	Total=t1-t2;
	
	//Payment/Output
	if (t2<t1)
	{
	    c.print("You still have to pay $");
	    c.println(+Total,0,2);
	}
	if (t2>t1)
	{
	    c.print("Your change is $");
	    c.println(Total*(-1),0,2);   
	}
	
	// Place your program here.  'c' is the output console
    } // main method
} // FoodStall class
