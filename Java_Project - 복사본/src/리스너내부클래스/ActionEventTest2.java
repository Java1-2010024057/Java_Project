package �����ʳ���Ŭ����;
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
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.!!!");
		button.addActionListener(new MyListener());//��ư�� �̺�Ʈ ������ ���
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener{//����Ŭ���� ����
		public void actionPerformed(ActionEvent e) {//��ư ���� �� ����
			if(e.getSource() == button) {
				label.setText("��ħ�� ��ư�� ���������ϴ�.");
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
