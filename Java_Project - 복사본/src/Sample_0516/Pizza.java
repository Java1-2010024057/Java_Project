package Sample_0516;

import javax.swing.*;

public class Pizza extends JFrame{
	
	public Pizza() {//�����ڿ��� �ʱ�ȭ �۾�
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
  
		JPanel panel = new JPanel(); //�ʿ��� �г� ����
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
  
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label1);//���̺� ������ �г� a�� �߰�
		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ������");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
  
		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10); 
		panelB.add(label2);
		panelB.add(field1);
  
		panel.add(panelA);//�г� a�� �г� b�� �гο� �߰�
		panel.add(panelB);
		add(panel);
		setVisible(true);
	
	}
	
}

/*
 panel.setLayout(new BorderLayout()); ��ġ������ ����
 panel.add(aComponet, BorderLayout.PAGE_START) : ���ʿ� ��ġ*/
