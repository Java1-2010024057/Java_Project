package 스윙컴포넌트;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다. 

public class TextFieldFrame extends JFrame {
       private JButton button;
       private JTextField text, result;
 
       public TextFieldFrame() {
             setSize(300, 130);
             setTitle("제곱 계산하기");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


             ButtonListener listener = new ButtonListener();//리스너 객체 생성
             

             JPanel panel = new JPanel();
             panel.add(new JLabel("숫자 입력: "));//레이블객체 생성

             text = new JTextField(15);		

             text.addActionListener(listener); //텍스트필드에 리스너 연결	
             panel.add(text);

             panel.add(new JLabel("제곱한 값: "));

             result = new JTextField(15);	
             result.setEditable(false);		//결과를 나타낼 텍스트 필드
             panel.add(result);  //편집 불가 설정

             button = new JButton("OK");
             button.addActionListener(listener);
             panel.add(button);
             add(panel);
             setVisible(true);
       }
       // 내부 클래스로서 텍스트 필드와 버튼의 액션 이벤트 처리 
       private class ButtonListener implements ActionListener {
             public void actionPerformed(ActionEvent e) {

                    if (e.getSource() == button || e.getSource() == text) {
                           String name = text.getText();
                           int value = Integer.parseInt(name);
                           result.setText(" " + value * value);

                           text.requestFocus();
                    }
             }
       }

       public static void main(String[] args) {
             new TextFieldFrame();
       }
}