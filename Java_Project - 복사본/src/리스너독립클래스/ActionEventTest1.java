package �����ʵ���Ŭ����;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("��ư�� ���������ϴ�.");
	}
}/*
*/
class MyFrame extends JFrame {

	private JButton button;
	private JLabel label;

	public MyFrame() {	
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("EVENT");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�.");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new MyListener());//��ư�� �̺�Ʈ ������ ���
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);

		
	}
	/*
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("��ħ�� ��ư�� ���������ϴ�.");
			}
		}
	}*/
}

public class ActionEventTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();

	}

}
