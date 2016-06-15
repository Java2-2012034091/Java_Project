package sample_0602;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener {

	private JPanel panel;
	private JTextField field;
	private JTextArea area; // 문자열의 출력을 담당

	public KeyEventTest() {
		panel = new JPanel(new GridLayout(0, 2));
		panel.add(new JLabel("문자를 입력하시오: "));
		field = new JTextField(10);
		panel.add(field);
		area = new JTextArea(3, 30);
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);

		field.addKeyListener(this);
		setTitle("KeyEvent Test");
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyEventTest(); // Let the constructor do the job
	}

	public void keyTyped(KeyEvent e) { // (3) //키 입력되면 호출
		display(e, "Key Typed        ");
	}

	public void keyPressed(KeyEvent e) { // 키 누르는순간 호출
		display(e, "Key Pressed    ");
	}

	public void keyReleased(KeyEvent e) { // 키에서 손떼는 순간 호출
		display(e, "Key Released ");
	}

	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: "
				+ e.isControlDown() + "Shift: " + e.isShiftDown();
		area.append("" + s + "문자 " + c + "(코드: " + keyCode + ") " + modifiers
				+ "\n");
	}

}