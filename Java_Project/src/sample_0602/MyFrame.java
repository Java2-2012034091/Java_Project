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
	addMouseListener(new MouseAdapter() { //����� Ŭ���� ���, ����Ŭ������ �гο� ���콺 ������ �߰�  
		public void mousePressed(MouseEvent e) {   // �̺�Ʈ ó�� ���ؼ� ������ �������̽��� ���� �� ��� �޼ҵ� ���� �ؾ���. ������ ���ϴ� �޼ҵ尡 �ϳ���
			img_x = e.getX();                      // �������̽��� ��� �޼ҵ� �����ؾ��ϴ� ������ ����. �׷��� �� �����ʿ� ���� �ϴ� ����� Ŭ������ ����.
			img_y = e.getY();                      // ��� Ŭ������ �̸� �������� ��� �޼ҵ带 ���� �س��� Ŭ������. ����� Ŭ���� ��ӹ޾� ���ϴ� �޼ҵ常 �������ϸ� ��.
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
