package tetsets;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




abstract class Frame {
	
	public abstract void draw(); 
};

class subFrame1 extends JFrame{
		
		BufferedImage img = null;
		int img_x = 0, img_y = 0;

		public subFrame1() {
		
		setTitle("subFrame1 : " );
		setSize(500, 300);
		addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		setVisible(true);
	}

		
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(img, img_x, img_y, null);
		}
			
}



class subFrame2 extends JFrame{
	   private JRadioButton First, Second, Third;
	   private JLabel text;
	   private JPanel top, sizepanel, result;
	  
	   public subFrame2() {
	      // TODO Auto-generated constructor stub
	      
		  
		  setTitle("subFrame2 : " );
	      setSize(500, 200);
	      
	      
	      
	      result = new JPanel();
	      text = new JLabel("Select Radio Button");
	      result.add(text);
	      add(result,BorderLayout.CENTER);
	      
	      sizepanel = new JPanel();
	      ButtonGroup size = new ButtonGroup();
	      First = new JRadioButton("First");
	      Second = new JRadioButton("Second");
	      Third = new JRadioButton("Third");
	      First.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 text.setText("Select Button1");
	         }
	      });
	      Second.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 text.setText("Select Button2");
	         }
	      });
	      Third.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 text.setText("Select Button3");
	         }
	      });
	      size.add(First);
	      size.add(Second);
	      size.add(Third);
	      sizepanel.add(First);
	      sizepanel.add(Second);
	      sizepanel.add(Third);
	      add(sizepanel, BorderLayout.NORTH);
	      setVisible(true);
	   }
	}


class TextAreaFrame extends JLabel implements ActionListener{
	
	protected JTextArea textArea;
	
	public TextAreaFrame(){
		
		textArea = new JTextArea(10, 30);
		JScrollPane scrollPane = new JScrollPane(textArea);
		textArea.setEditable(false);
		
		add(scrollPane, BorderLayout.CENTER);
		
		
	
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent evt){
		
		textArea.append("setTitle" + "\n");
		
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}
}
	
class finalterm extends JFrame{
		
		   JButton button1 = new JButton();
		   JButton button2 = new JButton();
		   TextAreaFrame label = new TextAreaFrame();
		   
		   public finalterm() {
		      // TODO Auto-generated constructor stub
		      setSize(500, 300);
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setTitle("Final-Term");
		      setLayout(new GridLayout(1,3,10,10));
		      button1 = new JButton("Make Frame1");
		      button1.addActionListener(new ActionListener() {
		    	  @Override
		    	  public void actionPerformed(ActionEvent e) {
		              // TODO Auto-generated method stub
		             subFrame1 subFrame1 = new subFrame1();
		            
		            }
		        });
		      
		      
		      button2 = new JButton("Make Frame2");
		      button2.addActionListener(new ActionListener() {
		    	  @Override
		    	  public void actionPerformed(ActionEvent e) {
		              
					// TODO Auto-generated method stub
		    		  
		              subFrame2 subframe2 = new subFrame2();
		              
		            }
		        });
		      
		      label = new TextAreaFrame();
		      add(button1);
		      add(button2);
		      add(label);
		      setVisible(true);

		   }
}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalterm ff = new finalterm();
	}

}
