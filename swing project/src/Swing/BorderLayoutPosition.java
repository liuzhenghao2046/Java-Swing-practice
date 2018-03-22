package Swing;
import java.awt.*;	
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
//�߽粼�ֹ�����
public class BorderLayoutPosition extends JFrame{
	//��������ڷ�λ�õ�����
	String[] border = {BorderLayout.CENTER, BorderLayout.NORTH,
			 BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST};
	String[] buttonName = {"center button", "north button", 
			 "south button", "west button", "east button"};
	public BorderLayoutPosition(){
		setTitle("�������ʹ�ñ߽粼�ֹ�����");	
		Container c = getContentPane();						//����һ������
		setLayout(new BorderLayout());						//��������Ϊ�߽粼�ֹ�����
		for(int i = 0; i<border.length; i ++){
			//�����������Ӱ�ť�������ð�ť����
			c.add(border[i], new JButton(buttonName[i]));
		}
		setSize(350,200);									//���ô����С
		setVisible(true);									//���ô���ɼ�
		//���ô���ر�ģʽ
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args){
		new BorderLayoutPosition();
	}
}