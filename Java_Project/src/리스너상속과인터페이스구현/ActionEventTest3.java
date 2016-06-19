package 리스너상속과인터페이스구현;
//중요!
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame implements ActionListener {
	//JFrame 상속과 동시에 액션리스너 구현
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("evnet");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("!!!아직 버튼이 눌러지지 않았습니다.");
		
		button.addActionListener(this); //현재 객체를 이벤트 리스너로 버튼에 등록, 자기 자신이 이벤트 처리
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {//클래스 안에 액션펄폼 정의
			if(e.getSource() == button){
				label.setText("마침내 버튼이 눌러졌습니다.");
			}
	}
}
	
public class ActionEventTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}
