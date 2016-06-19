package RemoteControl;

import javax.swing.*;
import java.awt.event.*;

class MyListener implements ActionListener{//리스너를 독립적인 클래스로 작성
	public void actionPerformed(ActionEvent e){
		JButton button = (JButton)e.getSource();
		button.setText("마침내 버튼이 눌려졌습니다.");
	}
}


class MyFrame extends JFrame{

	private JButton button;
	private JLabel label;
	
	public MyFrame(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new MyListener());
		/*{
			public void actionPerformed(ActionEvent e){
				if (e.getSource()==button){
					label.setText("마침내 버튼이 눌려졌습니다.");
				}
			}
		});*/
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
}



public class ActionEventTest1{
	public static void main(String[] args){
		MyFrame t = new MyFrame();
	}
}

