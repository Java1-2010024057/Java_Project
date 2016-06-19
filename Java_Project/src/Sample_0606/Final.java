package Sample_0606;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
class ketEvent extends JFrame{
   private JPanel panel;
   private JTextField text;
   private JTextArea area;
   
   public ketEvent() {
      // TODO Auto-generated constructor stub
      panel = new JPanel(new GridLayout(0, 2));
      panel.add(new JLabel("문자를 입력하세요 :"));
      text = new JTextField(10);
      panel.add(text);
      area = new JTextArea(3, 30);
      JScrollPane scrollPane = new JScrollPane(area);
      add(panel, BorderLayout.NORTH);
      add(scrollPane, BorderLayout.CENTER);
      
      text.addKeyListener(new KeyListener() {
         
         @Override
         public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub
            
         }
         
         @Override
         public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            display(e);
         }
         
         @Override
         public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
            
         }
      });
      
      setTitle("key event Test");
      setSize(300, 200);
      setVisible(true);
   }
   
   protected void display(KeyEvent e){
      char c = e.getKeyChar();
      int keyCode = e.getKeyCode();
      area.append("문자: " + c + "(코드:" + keyCode +")\n");
   }
}

class tictactoc extends JPanel{
   JButton[][] button = new JButton[3][3];
   private char turn = 'X';
   
   public tictactoc() {
      // TODO Auto-generated constructor stub
      setLayout(new GridLayout(3, 3));
      
      for(int i = 0;i<3;i++){
         for(int j=0; j<3; j++){
            button[i][j] = new JButton(" ");
            button[i][j].addActionListener(new ActionListener() {
               
               @Override
               public void actionPerformed(ActionEvent e) {
                  // TODO Auto-generated method stub
                  for(int i = 0; i<3; i++){
                     for(int j = 0; j<3; j++){
                        if(e.getSource() == button[i][j] && button[i][j].getText().equals(" ") == true){
                           if(turn == 'X'){
                              button[i][j].setText("X");
                              turn = 'O';
                              
                           }else if(turn =='O'){
                              button[i][j].setText("O");
                              turn = 'X';
                           }
            
                        }
                     }
                  }
               }
            });
            add(button[i][j]);
         }
      }
   }
}

class radio extends JFrame{
   private JRadioButton small, medium, large;
   private JLabel text;
   private JPanel top, sizepanel, result;
   
   public radio() {
      // TODO Auto-generated constructor stub
      setTitle("radio test");
      setSize(300, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      top = new JPanel();
      JLabel label = new JLabel("어떤 커피를 주문하시겠습니까 ?");
      top.add(label);
      add(top, BorderLayout.NORTH);
      
      result = new JPanel();
      text = new JLabel("크기가 선택되지 않았습니다");
      result.add(text);
      add(result,BorderLayout.SOUTH);
      
      sizepanel = new JPanel();
      ButtonGroup size = new ButtonGroup();
      small = new JRadioButton("small");
      medium = new JRadioButton("medium");
      large = new JRadioButton("large");
      small.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            text.setText("small 크기가 선택되었습니다.");
         }
      });
      medium.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            text.setText("medium 크기가 선택되었습니다.");
         }
      });
      large.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            text.setText("large 크기가 선택되었습니다.");
         }
      });
      size.add(small);
      size.add(medium);
      size.add(large);
      sizepanel.add(small);
      sizepanel.add(medium);
      sizepanel.add(large);
      
      add(sizepanel, BorderLayout.CENTER);
      setVisible(true);
   }
}

class f1 extends JFrame{
   JButton[] button = new JButton[3];
   
   public f1() {
      // TODO Auto-generated constructor stub
      setSize(300, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("main");
      setLayout(new GridLayout(3,1));
      button[0] = new JButton("1");
      button[0].addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JFrame page1 = new JFrame();
            page1.setTitle("tictactoc");
            page1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            page1.setSize(300, 300);
            tictactoc t = new tictactoc();
            page1.add(t);
            page1.setVisible(true);
         }
      });
      
      button[1] = new JButton("2");
      button[1].addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            ketEvent page2 = new ketEvent();
         }
      });
      
      button[2] = new JButton("3");
      button[2].addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            radio rad = new radio();
         }
      });
      add(button[0]);
      add(button[1]);
      add(button[2]);
      setVisible(true);
   }
}


public class Final {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      f1 aa = new f1();
   }

}