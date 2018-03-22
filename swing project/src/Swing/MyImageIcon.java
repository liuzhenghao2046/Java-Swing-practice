package Swing;
import java.awt.*;		//导入awt包
import java.awt.event.*;//导入event包
import javax.print.DocFlavor.URL;
import javax.swing.*;   //导入swing包 

public class MyImageIcon extends JFrame {
	public MyImageIcon(){
		Container container1 = getContentPane();//创建一个容器
		//create a label
		JLabel jl = new JLabel("这是标签，哦耶", JLabel.CENTER);
		//获取图片所在URL
		java.net.URL url1 = MyImageIcon.class.getResource("01.jpg");
		
		ImageIcon icon = new ImageIcon(url1);	//实例化Icon对象
		jl.setIcon(icon);   //给标签加图片
		//设置文字放置在标签中间
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);//将标签设置成不透明状态
		container1.add(jl);
		setVisible(true);
		setBackground(Color.white);
		setSize(400,400);
		//设置窗体关闭模式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		
	}
	public static void main(String[] args){
		new MyImageIcon();			//实例化MyImageIcon对象
	}
}
