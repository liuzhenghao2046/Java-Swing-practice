package Swing;
import java.awt.*;	
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
//�����ֹ�����
public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition(){
		setTitle("������ʹ�������ֹ����� (��������)��))*������*)o");//���ô������
		Container c = getContentPane();
		//���ô���ʹ�������ֹ�������ʹ����Ҷ��룬�����������֮���ˮƽ����봹ֱ���
		setLayout(new FlowLayout(2, 10, 10));
		for(int i = 0; i <10; i++){							  //��������ѭ�����10����ť
			c.add(new JButton("button" + i));
		}
		setSize(200, 300);									 //���ô����С
		setVisible(true);									//���ô���ɼ�
		//���ô���ر�ģʽ
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args){
		new FlowLayoutPosition();
	}
}
