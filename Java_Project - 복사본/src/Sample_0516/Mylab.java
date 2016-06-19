package Sample_0516;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//컨트롤 + 시프트 + o 로 필요한 클래스 포함
public class Mylab {

	public static void main(String[] args) {
		JFrame f = new JFrame(); //윈도우 프레임 만들기
		JPanel panel = new JPanel(); //프레임에 직접 추가하지말고 패널을 이용해 추가
		f.add(panel);//프레임에 패널 추가
		
		JLabel label1= new JLabel("화씨 온도");//컴포넌트 생성
		JLabel label2= new JLabel("섭씨 온도");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환");
		
		panel.add(label1);//패널에 컴포넌트들 추가
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		
		f.setSize(300, 150);//프레임속성 변경
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도변환기");
		f.setVisible(true);
		
		

	}

}
