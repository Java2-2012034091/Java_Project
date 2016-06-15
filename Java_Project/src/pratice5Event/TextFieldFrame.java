package pratice5Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

public class TextFieldFrame extends JFrame {
       private JButton button;
       private JTextField text, result;
 
       public TextFieldFrame() {
             setSize(300, 130);
             setTitle("���� ����ϱ�");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


             ButtonListener listener = new ButtonListener(); //������ ��ü ����
             

             JPanel panel = new JPanel();
             panel.add(new JLabel("���� �Է�: ")); //���̺� ��ü ����

             text = new JTextField(15);		//�÷����� 15�� �ؽ�Ʈ �ʵ� ����

             text.addActionListener(listener);	// �ؽ�Ʈ �ʵ忡 ������ ����
             panel.add(text);

             panel.add(new JLabel("������ ��: "));

             result = new JTextField(15);	
             result.setEditable(false);		   // ���� �Ұ� ����
             panel.add(result);

             button = new JButton("OK");
             button.addActionListener(listener);
             panel.add(button);
             add(panel);
             setVisible(true);
       }
       // ���� Ŭ�����μ� �ؽ�Ʈ �ʵ�� ��ư�� �׼� �̺�Ʈ ó�� 
       private class ButtonListener implements ActionListener {
             public void actionPerformed(ActionEvent e) {

                    if (e.getSource() == button || e.getSource() == text) {
                           String name = text.getText();
                           int value = Integer.parseInt(name);
                           result.setText(" " + value * value);
                           text.requestFocus(); // �ؽ�Ʈ �Է¹޾� ������ ��ȯ�ϰ� ������ ���� �� ����� result�� ���. �ؽ�Ʈ ��Ŀ���� text�� ����
                    }
             }
       }

       public static void main(String[] args) {
             new TextFieldFrame();
       }
}