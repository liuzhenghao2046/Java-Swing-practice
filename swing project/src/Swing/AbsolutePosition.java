package Swing;
import java.awt.*;
import javax.swing.*;
//绝对布局
public class AbsolutePosition extends JFrame {
	public AbsolutePosition(){
		setTitle("本窗体使用绝对布局");
		setLayout(null);
		setBounds(100,100,200,150);
		Container c = getContentPane();
		JButton b1 = new JButton("按钮1");
		JButton b2 = new JButton("按钮2");
		b1.setBounds(10,30,80,30);
		b2.setBounds(60,70,100,20);
		c.add(b1);
		c.add(b2);
		setVisible(true);
		//设置窗体关闭模式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new AbsolutePosition();
	}

}
