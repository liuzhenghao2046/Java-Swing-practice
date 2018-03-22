package Swing;
import java.awt.*;		//����awt��
import java.awt.event.*;//����event��
import javax.swing.*;   //����swing�� 
import javax.print.DocFlavor.URL;

public class CheckBoxTest extends JFrame {
	public CheckBoxTest() {

		Container c = getContentPane();
		final JTextArea jt = new JTextArea();
		jt.setRows(5);
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.NORTH,jt);
		
		Checkbox checkBox1 = new Checkbox("1");
		checkBox1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {
				if(itemEvent.getStateChange() == 2){
					jt.append("��ѡ��1ȡ��ѡ��!\r\n");
				}else{
					jt.append("��ѡ��1��ѡ��!\r\n");
				}
				
			}
		});
		Checkbox checkBox2 = new Checkbox("2");
		checkBox2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				
				System.out.println(arg0.getStateChange());
				
				if(arg0.getStateChange() == 2){
					jt.append("��ѡ��2ȡ��ѡ��!\r\n");
				}else{
					jt.append("��ѡ��2��ѡ��!\r\n");
				}
			}
		});
		Checkbox checkBox3 = new Checkbox("3");
		checkBox3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == 2){
					jt.append("��ѡ��3ȡ��ѡ��!\r\n");
				}else{
					jt.append("��ѡ��3��ѡ��!\r\n");
				}
			}
		});
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(BorderLayout.EAST, checkBox1);
		panel.add(BorderLayout.CENTER, checkBox2);
		panel.add(BorderLayout.WEST, checkBox3);
		
		c.add(BorderLayout.SOUTH,panel);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		

	}

	public static void main(String[] args) {
		new CheckBoxTest();
	}

}
