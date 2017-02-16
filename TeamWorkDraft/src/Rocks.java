import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import javax.swing.JComponent;

public class Rocks extends JComponent {
	public int numberOfRocks = 0;
	public int RocksPosX;
	public int RocksPosY;
	public Rectangle SingleRocks = new Rectangle(10,10,8,8);
	public void paintComponent (Graphics g){
		Graphics2D Rocksg2 = (Graphics2D) g;
	//Single Rocks, now they have a location for testing purpose, later put location in random inside the border
	   Rocksg2.setColor(Color.YELLOW);
       while( numberOfRocks < 11){
    	   Random X = new Random();
           RocksPosX =  X.nextInt(this.getWidth());
           Random Y = new Random();
           RocksPosY = Y.nextInt(this.getHeight());
	       SingleRocks.setLocation(RocksPosX, RocksPosY);
	       Rocksg2.fill(SingleRocks);
	       numberOfRocks++;
       }
   
	

     
    }
	
	
}
