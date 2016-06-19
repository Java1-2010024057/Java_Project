package 리스너내부클래스;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;

class MyFrame2 extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame2() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("event");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.!!!");
		button.addActionListener(new MyListener());//버튼에 이벤트 리스너 등록
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener{//내부클래스 정의
		public void actionPerformed(ActionEvent e) {//버튼 누를 때 실행
			if(e.getSource() == button) {
				label.setText("마침내 버튼이 눌러졌습니다.");
			}
		}
	}
}

public class ActionEventTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame2 t = new MyFrame2();

	}

}
