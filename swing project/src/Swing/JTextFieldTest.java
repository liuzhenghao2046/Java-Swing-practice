package Swing;
import java.awt.*;		//导入awt包
import java.awt.event.*;//导入event包
import javax.swing.*;   //导入swing包 
import javax.print.DocFlavor.URL;
import javax.swing.text.JTextComponent;

public class JTextFieldTest extends JFrame {
	public JTextFieldTest() {
		Container c = getContentPane();
		
		JTextField jt = new JTextField("abcdefg", 30);
//		jt.setSize(50, 50);
		JButton jb = new JButton("清除");
//		jb.setSize(180, 30);

		
		c.setLayout(new BorderLayout());
		
		
		c.add(BorderLayout.NORTH,jt);
		c.add(BorderLayout.SOUTH,jb);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jb.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("a");
				jt.setText("触发事件");
				jt.setText("");
				jt.requestFocus();
			}
			
			
			
		});


	}

	public static void main(String[] args) {
		new JTextFieldTest();
	}

}
