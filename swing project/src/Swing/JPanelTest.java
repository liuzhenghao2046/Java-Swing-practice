package Swing;
import java.awt.*;	
import javax.swing.*;
//JScrollPane面板，显示出带滚动条的面板

	public class JPanelTest extends JFrame{
		public JPanelTest(){
			Container c = getContentPane();
			//将整个容器设置成2行1列的布局
			c.setLayout(new GridLayout(2,1,10,10));
			//初始化一个面板，设置1行3列的网格布局
			JPanel p1 = new JPanel(new GridLayout(1,3,10,10));
			JPanel p2 = new JPanel(new GridLayout(1,2,10,10));
			JPanel p3 = new JPanel(new GridLayout(1,2,10,10));
			JPanel p4 = new JPanel(new GridLayout(2,1,10,10));
			p1.add(new JButton("按钮1"));						  //在面板中添加按钮
			p2.add(new JButton("按钮2"));
			p3.add(new JButton("按钮3"));
			p4.add(new JButton("按钮4"));
			c.add(p1);										  //在容器中添加面板
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


