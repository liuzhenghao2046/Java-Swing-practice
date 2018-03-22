package Swing;
import java.awt.*;		//导入awt包
import java.awt.event.*;//导入event包
import javax.swing.*;   //导入swing包 
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
					jt.append("复选框1取消选中!\r\n");
				}else{
					jt.append("复选框1被选中!\r\n");
				}
				
			}
		});
		Checkbox checkBox2 = new Checkbox("2");
		checkBox2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				
				System.out.println(arg0.getStateChange());
				
				if(arg0.getStateChange() == 2){
					jt.append("复选框2取消选中!\r\n");
				}else{
					jt.append("复选框2被选中!\r\n");
				}
			}
		});
		Checkbox checkBox3 = new Checkbox("3");
		checkBox3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == 2){
					jt.append("复选框3取消选中!\r\n");
				}else{
					jt.append("复选框3被选中!\r\n");
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
