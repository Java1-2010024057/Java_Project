package Sample_0516;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {//JFrame 상속

	public MyFrame(){
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); // 현재 화면의 크기 얻기
		
		setSize(300,200);
		setLocation(screenSize.width / 2, screenSize.height / 2); //프레임 위치 중앙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout()); //컴포넌트를 물 흐르듯 순차적으로 , 안 하면 버튼이 전체화면
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
