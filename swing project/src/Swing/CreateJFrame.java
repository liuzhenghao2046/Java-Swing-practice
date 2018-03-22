package Swing;
import java.awt.*;
import javax.swing.*;
public class CreateJFrame extends JFrame{
	public void CreateJFrame(String title){				//定义一个createjframe（）方法
		JFrame jf = new JFrame();						//实例化一个对象
		Container container = jf.getContentPane();		//获取一个容器
		JLabel jl = new JLabel("这是一个JFrame窗口");	//在创建一个JFrame标签,并且表明标签标题
		//使标签上的文字居中
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(new Button("Start"));				//添加组件放到容器中去，命名为start
		container.add(jl);								//将标签添加到容器中去
		container.setBackground(Color.white);			//设置容器的背景颜色
		jf.setVisible(true);							//使窗体可视
		jf.setSize(300, 300);							//设置窗体大小
		//设置窗体关闭模式
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){				//在主方法中调用CreateJFrame（）方法
		new CreateJFrame().CreateJFrame("这是第一个JFrame窗体");
	}
}
