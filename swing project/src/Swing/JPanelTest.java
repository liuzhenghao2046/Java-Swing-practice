package Swing;
import java.awt.*;	
import javax.swing.*;
//JScrollPane��壬��ʾ���������������

	public class JPanelTest extends JFrame{
		public JPanelTest(){
			Container c = getContentPane();
			//�������������ó�2��1�еĲ���
			c.setLayout(new GridLayout(2,1,10,10));
			//��ʼ��һ����壬����1��3�е����񲼾�
			JPanel p1 = new JPanel(new GridLayout(1,3,10,10));
			JPanel p2 = new JPanel(new GridLayout(1,2,10,10));
			JPanel p3 = new JPanel(new GridLayout(1,2,10,10));
			JPanel p4 = new JPanel(new GridLayout(2,1,10,10));
			p1.add(new JButton("��ť1"));						  //���������Ӱ�ť
			p2.add(new JButton("��ť2"));
			p3.add(new JButton("��ť3"));
			p4.add(new JButton("��ť4"));
			c.add(p1);										  //��������������
			c.add(p2);
			c.add(p3);
			c.add(p4);
			setSize(400,400);
			setVisible(true);
		}
		public static void main(String[] args){
			new JPanelTest();
		}
	}


