package Swing;
import java.awt.*;	
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutPosition extends JFrame{
	public GridLayoutPosition(){
		Container c = getContentPane();
		//��������ʹ�����񲼾ֹ�����������7��3�е�����
		setLayout(new GridLayout(7,3,5,5));
		for(int i = 0; i<21; i++){
			c.add(new JButton("��ť"+ i));	//ѭ����Ӱ�ť
		}
		setSize(300,300);					//���ô����С
		setTitle("����һ��ʹ�����񲼾ֹ������ĵط�");
		setVisible(true);					//���ô���ɼ�
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new GridLayoutPosition();
	}
}
