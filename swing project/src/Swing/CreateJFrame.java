package Swing;
import java.awt.*;
import javax.swing.*;
public class CreateJFrame extends JFrame{
	public void CreateJFrame(String title){				//����һ��createjframe��������
		JFrame jf = new JFrame();						//ʵ����һ������
		Container container = jf.getContentPane();		//��ȡһ������
		JLabel jl = new JLabel("����һ��JFrame����");	//�ڴ���һ��JFrame��ǩ,���ұ�����ǩ����
		//ʹ��ǩ�ϵ����־���
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(new Button("Start"));				//�������ŵ�������ȥ������Ϊstart
		container.add(jl);								//����ǩ��ӵ�������ȥ
		container.setBackground(Color.white);			//���������ı�����ɫ
		jf.setVisible(true);							//ʹ�������
		jf.setSize(300, 300);							//���ô����С
		//���ô���ر�ģʽ
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){				//���������е���CreateJFrame��������
		new CreateJFrame().CreateJFrame("���ǵ�һ��JFrame����");
	}
}
