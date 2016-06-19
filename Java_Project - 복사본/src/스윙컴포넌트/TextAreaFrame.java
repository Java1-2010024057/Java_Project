package 스윙컴포넌트;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaFrame extends JFrame implements ActionListener{
	protected JTextField textField;
	protected JTextArea textArea;
	
	public TextAreaFrame(){
		setTitle("Text Area Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10, 30);
		JScrollPane scrollPane = new JScrollPane(textArea); //스크롤바
		textArea.setEditable(false);
		
		add(scrollPane, BorderLayout.CENTER);
		add(textField, BorderLayout.NORTH);
		//add(textArea, BorderLayout.CENTER); ->scrollPane을 위에 붙였기 때문에 2번 붙이지 말기
		
		pack();
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent evt){
		String text = textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}
	public static void main(String[] args) {
		
		new TextAreaFrame();
	}
	
}

