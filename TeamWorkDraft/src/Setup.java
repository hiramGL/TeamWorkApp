import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Setup{
	public static void main(String[] args){
		//Environment Frame
		JFrame Environment = new JFrame();
		Environment.setSize(500, 500);
		Environment.setTitle("Environment");
		Environment.getContentPane().setBackground(Color.white);
		Environment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Make rocks in the 
		CenterComponent Arena = new CenterComponent();
		Environment.add(Arena);
		/*;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
		 *                        Types of Rocks
		 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;*/
		
		//Rocks SetSingleRocks = new Rocks();
	    //Environment.add(SetSingleRocks);
		Environment.setVisible(true);
		//Robot Frame 
	    JFrame Robot = new JFrame();
	    Robot.setSize(500,500);
	    Robot.setTitle("Robot");
	    Robot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    RobotsComponent Construction = new RobotsComponent();
	    Robot.add(Construction);
	    
	  
	}

}
