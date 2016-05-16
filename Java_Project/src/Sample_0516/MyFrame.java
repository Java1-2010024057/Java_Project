package Sample_0516;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

	public MyFrame(){
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		setSize(300,200);
		setLocation(screenSize.width / 2, screenSize.height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button1 = new JButton("in");
		JButton button2 = new JButton("exit");
		this.add(button1);
		this.add(button2);
		setVisible(true);
	}
}
