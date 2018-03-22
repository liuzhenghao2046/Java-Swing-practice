package Swing;
import java.awt.*;	
import javax.swing.*;						//包含Swing包

public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest(){
		Container c = getContentPane();		//创建文本区域组件
		JTextArea ta = new JTextArea(20,50);//创建JScrollPane面板对象
		JScrollPane sp = new JScrollPane(ta);//将该面板添加到该容器中
		c.add(sp);
		setTitle("带滚动条的文字编译器");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public void main(String[] args){
		new JScrollPaneTest();
	}
	

}
