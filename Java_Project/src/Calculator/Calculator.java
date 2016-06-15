package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame { //JFrame 상속 받으면 바로 add(붙일거) 사용?

	private JPanel panel;
	private JTextField textField;
	private JButton[] buttons;
	private String[] labels = { 
			"7", "8", "9", "+", "-",
			"4", "5", "6", "*", "/",
			"1", "2", "3", "%", "=",
			"0", "", "", "", ""
	};

	public Calculator() {
		setTitle("Caculator");
		textField = new JTextField(70);
		panel = new JPanel();
		textField.setText("0");
		//textField.setEnabled(false);
  
		panel.setLayout(new GridLayout(4, 5, 1, 1));
		buttons = new JButton[20];
		int index = 0;
		for (int rows = 0; rows < 4; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(textField, BorderLayout.NORTH); // SOUTH, WEST, EAST, NORTH..
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
  
	public static void main(String args[]) {
		Calculator C = new Calculator();
	}
}

