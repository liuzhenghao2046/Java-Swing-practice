package Swing;
import java.awt.*;
import javax.swing.*;
//���Բ���
public class AbsolutePosition extends JFrame {
	public AbsolutePosition(){
		setTitle("������ʹ�þ��Բ���");
		setLayout(null);
		setBounds(100,100,200,150);
		Container c = getContentPane();
		JButton b1 = new JButton("��ť1");
		JButton b2 = new JButton("��ť2");
		b1.setBounds(10,30,80,30);
		b2.setBounds(60,70,100,20);
		c.add(b1);
		c.add(b2);
		setVisible(true);
		//���ô���ر�ģʽ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new AbsolutePosition();
	}

}
