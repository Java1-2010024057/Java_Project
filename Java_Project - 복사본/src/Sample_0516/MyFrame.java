package Sample_0516;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {//JFrame ���

	public MyFrame(){
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); // ���� ȭ���� ũ�� ���
		
		setSize(300,200);
		setLocation(screenSize.width / 2, screenSize.height / 2); //������ ��ġ �߾�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout()); //������Ʈ�� �� �帣�� ���������� , �� �ϸ� ��ư�� ��üȭ��
		JButton button1 = new JButton("in");
		JButton button2 = new JButton("exit");
		this.add(button1);
		this.add(button2);
		setVisible(true);
	}
	/*
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	*/
}
