package Swing;
import java.awt.*;		//����awt��
import java.awt.event.*;//����event��
import javax.swing.*;   //����swing�� 

public class DrawIcon implements Icon{  //ʵ��icon�ӿ�
 int width;		//����ͼ��Ŀ�
 int height;	//����ͼ��ĳ�
	public int getIconHeight(){ //ʵ��getIconheight��������
		return this.height;
	}
	public int getIconWidth(){	//ʵ��getIconWidth��������
		return this.width;
	}
	public DrawIcon(int width, int height){	//���幹�췽��
		this.width = width;
		this.height = height;
	}
	//ʵ��paintIcon��������
	public void paintIcon(Component arg0,Graphics arg1, int x, int y){
		arg1.fillOval(x, y, width, height);	//����һ��ͼ��
	}
	public void createframe(String title){
		DrawIcon icon = new DrawIcon(15, 15);
		//����һ����ǩ�������ñ�ǩ�ϵ������ڱ�ǩ���м�
		JFrame jf = new JFrame();			//����һ��JFrame���
		JLabel j = new JLabel("����", icon, SwingConstants.CENTER);
		Container c = jf.getContentPane();
		c.add(j);
		c.setBackground(Color.white);
	    jf.setVisible(true);
	    jf.setSize(200,200);
	    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new CreateJFrame().CreateJFrame("the window");
	   
	}
	
}
