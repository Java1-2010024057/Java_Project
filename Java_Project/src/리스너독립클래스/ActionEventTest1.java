package 리스너독립클래스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("버튼이 눌러졌습니다.");
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
		button = new JButton("버튼을 누르시오.");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new MyListener());//버튼에 이벤트 리스너 등록
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);

		
	}
	/*
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("마침내 버튼이 눌려졌습니다.");
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
