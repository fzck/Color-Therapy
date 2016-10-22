import java.awt.*;
import javax.swing.*;

public class I_test {

	public static void main(String[] args) {

		JFrame frame = new JFrame("I");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000, 1000));
		frame.setBackground(Color.WHITE);

		final I s = new I();

		frame.setContentPane(s);

		new Thread(new Runnable() {
			public void run() {

				while(true) {
					try {
						Thread.sleep(5); //speed
					} catch (Exception e){ }
					s.repaint();
				}
			}

		}).start();

		frame.pack();
		frame.setVisible(true);

	}

}