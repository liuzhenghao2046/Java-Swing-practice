package Swing;
import java.awt.*;		//����awt��
import java.awt.event.*;//����event��
import javax.swing.*;   //����swing��

public class myjdialog extends JDialog {	//��������̳�JDialog��
	public myjdialog (Frame frame) {
		//ʵ����һ��JDialog��Ķ���ָ���Ի���ĸ����壬������������
		super(frame, "the first JDialog window", true);
		Container container = getContentPane();//����һ������
		container.add(new JLabel("this is a conversation frame"));//����������ӱ�ǩ
		setBounds(200,200,200,200);//���öԻ����С
	}
	
	public static void main(String[] args) {
		new MyFrame(); //ʵ����MyDialog
	}
}

	class MyFrame extends JFrame {		//��������
		
		public MyFrame() {
			JFrame jf = new JFrame();  //ʵ����һ��JFrame����
			jf.setVisible(true);	  //ʹ�Ӵ�����
			jf.setSize(300, 200);	 //���ô���Ĵ�С
			
			Container container  = getContentPane();//����һ������
			container.setLayout(null);
			JLabel jl = new JLabel("this is a JFrame window");//�ڴ��������ñ�ǩ
			jl.setHorizontalAlignment(SwingConstants.CENTER);//����ǩ����������
			container.add(jl);
			container.setBackground(Color.green);//��������ɫ���ó���ɫ
			JButton bl = new JButton("����Ի���");//����һ����ť
			bl.setBounds(10,10,100,21);//���ð�ť��С
			bl.addActionListener(new ActionListener() { //Ϊ��ť�����굥���¼�
				public void actionPerformed(ActionEvent e){
					//ʹMyJDialog����ɼ�
					new myjdialog(MyFrame.this).setVisible(true);
				}
			});
			container.add(bl);//����ť��ӵ�������ȥ
			jf.setContentPane(container);//��������ӵ�������ȥ
			
		}
	}
			
		
	
