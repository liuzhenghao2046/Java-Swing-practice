package Swing;
import java.awt.*;		//导入awt包
import java.awt.event.*;//导入event包
import javax.swing.*;   //导入swing包 

public class DrawIcon implements Icon{  //实现icon接口
 int width;		//声明图标的宽
 int height;	//声明图标的长
	public int getIconHeight(){ //实现getIconheight（）方法
		return this.height;
	}
	public int getIconWidth(){	//实现getIconWidth（）方法
		return this.width;
	}
	public DrawIcon(int width, int height){	//定义构造方法
		this.width = width;
		this.height = height;
	}
	//实现paintIcon（）方法
	public void paintIcon(Component arg0,Graphics arg1, int x, int y){
		arg1.fillOval(x, y, width, height);	//绘制一个图形
	}
	public void createframe(String title){
		DrawIcon icon = new DrawIcon(15, 15);
		//创建一个标签，并设置标签上的文字在标签正中间
		JFrame jf = new JFrame();			//创建一个JFrame框架
		JLabel j = new JLabel("测试", icon, SwingConstants.CENTER);
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
