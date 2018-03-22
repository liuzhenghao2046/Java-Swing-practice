package Swing;
import java.awt.*;		//����awt��
import java.awt.event.*;//����event��
import javax.print.DocFlavor.URL;
import javax.swing.*;   //����swing�� 

public class MyImageIcon extends JFrame {
	public MyImageIcon(){
		Container container1 = getContentPane();//����һ������
		//create a label
		JLabel jl = new JLabel("���Ǳ�ǩ��ŶҮ", JLabel.CENTER);
		//��ȡͼƬ����URL
		java.net.URL url1 = MyImageIcon.class.getResource("01.jpg");
		
		ImageIcon icon = new ImageIcon(url1);	//ʵ����Icon����
		jl.setIcon(icon);   //����ǩ��ͼƬ
		//�������ַ����ڱ�ǩ�м�
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);//����ǩ���óɲ�͸��״̬
		container1.add(jl);
		setVisible(true);
		setBackground(Color.white);
		setSize(400,400);
		//���ô���ر�ģʽ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		
	}
	public static void main(String[] args){
		new MyImageIcon();			//ʵ����MyImageIcon����
	}
}
