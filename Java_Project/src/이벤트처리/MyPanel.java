package �̺�Ʈó��;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

public class MyPanel extends JPanel implements ActionListener {
	double A, B, C;
	JButton[][] buttons = new JButton[10][10];
	char[][] board = new char[10][10];
	private char turn='X';

	public MyPanel() {
		setLayout(new GridLayout(10, 10, 5, 5));
		Font f = new Font("Dialog", Font.ITALIC, 50);	

		for(int i =0;i<10;i++){
			for(int j =0;j<10;j++){
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(f);		
				buttons[i][j].addActionListener(this);
				add(buttons[i][j]);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i =0;i<10;i++){
			for(int j =0;j<10;j++){
				if( e.getSource()==buttons[i][j] && buttons[i][j].getText().equals(" ") ==true){
					if( turn == 'X'){
						buttons[i][j].setText("X");
						turn = 'O';
					}
					else {
						buttons[i][j].setText("O");
						turn = 'X';
						
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(300, 300);
		f.setVisible(true);
	}
}