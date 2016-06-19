package 키이벤트;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다. 

class MyPanel extends JPanel {

	BufferedImage img = null;
	int img_x = 100, img_y = 100;

	public MyPanel() {
		try {
			img = ImageIO.read(new File("car.gif"));

		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}//이미지 읽기
		addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP:	img_y -= 10;	break;
				case KeyEvent.VK_DOWN:	img_y += 10;	break;
				case KeyEvent.VK_LEFT:	img_x -= 10;	break;
				case KeyEvent.VK_RIGHT:	img_x += 10;	break;
				}//키리스너를 무명클래스로 작성해 붙이기,
				repaint();
			}
			public void keyReleased(KeyEvent arg0) {		}
			public void keyTyped(KeyEvent arg0) {			}

		});
		this.requestFocus();
		setFocusable(true);//키보드 포커스 요청, 패널이 포커스를 받을 수 있게 (디폴트로는 불가)
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);

	}
}

public class CarGameTest extends JFrame {
	public CarGameTest() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		CarGameTest s = new CarGameTest();
	}
}