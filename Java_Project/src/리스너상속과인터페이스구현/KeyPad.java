package 리스너상속과인터페이스구현;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
//소스 입력후 컨트롤 시프트 o
public class KeyPad extends JFrame implements ActionListener {//프레임 클래스가 이벤트도 처리
	private JTextField txt;
	private JPanel panel;

	public KeyPad() {
		txt = new JTextField(20);
		add(txt, BorderLayout.NORTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		add(panel, BorderLayout.CENTER);
		for (int i = 1; i <= 9; i++) {
			JButton btn = new JButton("" + i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100, 100));
			panel.add(btn);
		}
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {//이벤트발생시 호출
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText() + actionCommand);
	}

	public static void main(String[] args) {
		new KeyPad();
	}

}
