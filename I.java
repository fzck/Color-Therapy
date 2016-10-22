import java.awt.*;
import javax.swing.*;
import java.util.*;

public class I extends JPanel {

	public I() {
		super();
	}

	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;

		Random random = new Random();

		for(int i=0; i<random.nextInt(10) + 1; i+= 1) {
			int x = random.nextInt(this.getWidth());
			int y = random.nextInt(this.getHeight());

			//trigger levels

			//g2d.setColor(Color.YELLOW); // headache?
			g2d.setColor(Color.RED); //anger?
			//g2d.setColor(Color.ORANGE); //headache?

			//g2d.setColor(Color.GREEN); //nirvana
			//g2d.setColor(Color.BLUE); //arctic brr

			g2d.drawString("*", x, y);
		}

	}

}