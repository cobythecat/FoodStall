// The "D007" class.
import java.awt.*;
import hsa.Console;

public class D007
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.setColor(Color.green);
	c.fillRect(0,300,700,250);
	c.setColor(Color.cyan);
	c.fillRect(0,0,700,300);
	c.setColor(Color.red);
	c.fillRect(175,150,300,275);
	c.setColor(Color.black);
	c.fillRect(400,100,50,50);
	c.setColor(Color.black);
	c.fillRect(280,325,50,100);
	c.fillRect(331,325,50,100);
	c.setColor(Color.gray);
	c.fillOval(400,75,20,20);
	c.fillOval(390,50,20,20);
	c.fillOval(410,65,20,20);
	c.fillOval(425,70,20,20);
	c.fillOval(415,45,20,20);
	c.setColor(Color.lightGray);
	c.fillRoundRect(500,50,100,45,35,35);
	c.fillRoundRect(200,20,100,45,35,35);
	c.fillRoundRect(50,40,100,45,35,35);
	c.fillRoundRect(275,75,100,45,35,35);
	c.fillRoundRect(25,120,100,45,35,35);
	c.setColor(Color.darkGray);
	c.drawRect(250,200,50,50);
	c.drawRect(350,200,50,50);
	c.setColor(new Color(139,69,19));
	c.fillRect(60,275,50,175);
	c.setColor(new Color(0,100,20));
	c.fillOval(25,200,120,120);
	c.setColor(new Color(100,0,0));
	c.fillMapleLeaf(50,250,20,20);
	c.fillMapleLeaf(75,270,20,20);
	c.fillMapleLeaf(90,220,20,20);
	c.fillMapleLeaf(100,255,20,20);
	
	// Place your program here.  'c' is the output console
    } // main method
} // D007 class
