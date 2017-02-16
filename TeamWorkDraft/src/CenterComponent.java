import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class CenterComponent extends JComponent {
	public void paintComponent (Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double center = new Ellipse2D.Double((this.getWidth())/2 - 50,(this.getHeight())/2 - 50,100,100);
		Rectangle BackgroundColor = new Rectangle(5,5,this.getWidth() - 10,this.getHeight() - 10);
		
		/*Center is the Base
		 * Limit is the border
		 */
		g.fillRect(0, 0, getWidth(), getHeight());
	    g2.setColor(Color.GRAY);
		g2.fill(BackgroundColor);
		g2.setColor(Color.magenta);
		g2.fill(center);
		g2.setColor(Color.BLACK);
		g2.drawString("Team Work", ((this.getWidth()/2)-100) + 130, (this.getHeight()/2) -100);
	}

}
