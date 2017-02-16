import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JComponent;
public class RobotsComponent extends JComponent {
	private int RuedaXpos;
	private int RuedaYpos;
	public void paintComponent (Graphics g){
		Graphics2D Robotg2 = (Graphics2D) g;
		Rectangle Body = new Rectangle(this.getWidth()/2,this.getHeight()/2,30,50);
		Rectangle BodyBorder = new Rectangle(this.getWidth()/2 ,this.getHeight()/2 ,30,50);
		//Ruedas "T" = Top, "L" = Left, "B" = Bottom, "R" = Right
		Rectangle ruedaTL =  new Rectangle(this.getWidth()/2 - 10,this.getHeight()/2 ,10,15);
		RuedaYpos = RuedaYpos + 30;
		 Rectangle ruedaBL = new Rectangle(this.getWidth()/2 -10,this.getHeight()/2 + 35, 10,15);
		 RuedaXpos = RuedaXpos + 40;
		 Rectangle ruedaBR = new Rectangle(this.getWidth()/2 + 30,this.getHeight()/2 ,10,15);
		 Rectangle ruedaTR = new Rectangle(this.getWidth()/2 + 30, this.getHeight()/2 + 35,10,15);
		 //Base of ancla or base de pinzas del robot
		 Rectangle BasePincer = new Rectangle(this.getWidth()/2 + 15 - 4, this.getHeight()/2 - 14,4,12);
		 Rectangle BasePincer2 = new Rectangle(this.getWidth()/2 + 15 , this.getHeight()/2 - 14,4,12);
		 // Base where the pincers are
		 Rectangle BaseOfPincers = new Rectangle(this.getWidth()/2 + 15 - 6, this.getHeight()/2 - 2,12,2);
		// Rectangles of Left Pincer
		 Rectangle HookL = new Rectangle(this.getWidth()/2 + 15 -6,this.getHeight()/2 - 24, 2,10 );
		
		 Rectangle HookB = new Rectangle(this.getWidth()/2 + 15 -6,this.getHeight()/2 -16, 6,2 );
		 
		 Rectangle HookT = new Rectangle(this.getWidth()/2 + 15 -6,this.getHeight()/2 -24,6,2);
		 //Rectangle of the Right Pincer
		 Rectangle Hook2R = new Rectangle(this.getWidth()/2 +19,this.getHeight()/2 -24,2,10);
		 Rectangle Hook2B = new Rectangle(this.getWidth()/2 +15,this.getHeight()/2 -16,6,2);
		 Rectangle Hook2T = new Rectangle(this.getWidth()/2 +15,this.getHeight()/2 -24,6,2);
		 
		 
		 
		 //Set colors of part of the robot
		 
		Robotg2.setColor(Color.BLUE);
		Robotg2.fill(Body);
		Robotg2.setColor(Color.BLACK);
		Robotg2.draw(BodyBorder);
		Robotg2.setColor(Color.GRAY);
		Robotg2.fill(ruedaTL);
		Robotg2.fill(ruedaBL);
		Robotg2.fill(ruedaBR);
		Robotg2.fill(ruedaTR);
		Robotg2.fill(BasePincer);
		Robotg2.fill(BasePincer2);
		Robotg2.setColor(Color.BLACK);
		Robotg2.fill(BaseOfPincers);
		Robotg2.fill(HookL);
		Robotg2.fill(HookB);
		Robotg2.fill(HookT);
		Robotg2.fill(Hook2R);
		Robotg2.fill(Hook2B);
		Robotg2.fill(Hook2T);
	}


}
