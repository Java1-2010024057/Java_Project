package Sample_0516;

import javax.swing.*;

public class Pizza extends JFrame{
	
	public Pizza() {//생성자에서 초기화 작업
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
  
		JPanel panel = new JPanel(); //필요한 패널 생성
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
  
		JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		panelA.add(label1);//레이블 생성해 패널 a에 추가
		JButton button1 = new JButton("콤보피자");
		JButton button2 = new JButton("포테이토피자");
		JButton button3 = new JButton("불고기피자");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
  
		JLabel label2 = new JLabel("개수");
		JTextField field1 = new JTextField(10); 
		panelB.add(label2);
		panelB.add(field1);
  
		panel.add(panelA);//패널 a와 패널 b를 패널에 추가
		panel.add(panelB);
		add(panel);
		setVisible(true);
	
	}
	
}

/*
 panel.setLayout(new BorderLayout()); 배치관리자 설정
 panel.add(aComponet, BorderLayout.PAGE_START) : 북쪽에 배치*/
