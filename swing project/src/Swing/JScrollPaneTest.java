package Swing;
import java.awt.*;	
import javax.swing.*;						//����Swing��

public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest(){
		Container c = getContentPane();		//�����ı��������
		JTextArea ta = new JTextArea(20,50);//����JScrollPane������
		JScrollPane sp = new JScrollPane(ta);//���������ӵ���������
		c.add(sp);
		setTitle("�������������ֱ�����");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public void main(String[] args){
		new JScrollPaneTest();
	}
	

}
