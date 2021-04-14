package tankWar;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Frame f = new Frame();
		f.setSize(800,600);
		f.setResizable(false);
		f.setTitle("Tank war");
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	
		
	}
	

}
