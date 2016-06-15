package sample_0602;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y = 0;
	
	public MyPanel() {
	try {
		img = ImageIO.read(new File("car.gif"));
	} catch (IOException e) {
		System.out.println("no image");
		System.exit(1);
	}
	addMouseListener(new MouseAdapter() { //어댑터 클래스 사용, 무명클래스로 패널에 마우스 리스너 추가  
		public void mousePressed(MouseEvent e) {   // 이벤트 처리 위해선 리스너 인터페이스에 정의 된 모든 메소드 구현 해야함. 하지만 원하는 메소드가 하나라도
			img_x = e.getX();                      // 인터페이스의 모든 메소드 구현해야하는 불편함 따름. 그래서 각 리스너에 대응 하는 어댑터 클래스가 있음.
			img_y = e.getY();                      // 어뎁터 클레스는 미리 리스너의 모든 메소드를 구현 해놓은 클래스임. 어댑터 클래스 상속받아 원하는 메소드만 재정의하면 됨.
			repaint();                            // Component, Container, Key, Mouse, MouseMotion, Wondow + Adapter
		}                                         // public class MyClass extends MouseAdapter//implements X
	});
}
	
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(img, img_x, img_y, null);
	}
}
	
public class MyFrame extends JFrame {
	public MyFrame() {
		add(new MyPanel());
		setSize(300,500);
		setVisible(true);
	}

	public static void main(String[] arg) {
		new MyFrame();
	}
}
