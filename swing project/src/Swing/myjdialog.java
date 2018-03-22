package Swing;
import java.awt.*;		//导入awt包
import java.awt.event.*;//导入event包
import javax.swing.*;   //导入swing包

public class myjdialog extends JDialog {	//创建新类继承JDialog类
	public myjdialog (Frame frame) {
		//实例化一个JDialog类的对象，指定对话框的父窗体，窗体标题和类型
		super(frame, "the first JDialog window", true);
		Container container = getContentPane();//创建一个容器
		container.add(new JLabel("this is a conversation frame"));//在容器中添加标签
		setBounds(200,200,200,200);//设置对话框大小
	}
	
	public static void main(String[] args) {
		new MyFrame(); //实例化MyDialog
	}
}

	class MyFrame extends JFrame {		//创建新类
		
		public MyFrame() {
			JFrame jf = new JFrame();  //实例化一个JFrame对象
			jf.setVisible(true);	  //使视窗可视
			jf.setSize(300, 200);	 //设置窗体的大小
			
			Container container  = getContentPane();//创建一个容器
			container.setLayout(null);
			JLabel jl = new JLabel("this is a JFrame window");//在窗体中设置标签
			jl.setHorizontalAlignment(SwingConstants.CENTER);//将标签设置在中心
			container.add(jl);
			container.setBackground(Color.green);//将背景颜色设置成绿色
			JButton bl = new JButton("点击对话框");//定义一个按钮
			bl.setBounds(10,10,100,21);//设置按钮大小
			bl.addActionListener(new ActionListener() { //为按钮添加鼠标单机事件
				public void actionPerformed(ActionEvent e){
					//使MyJDialog窗体可见
					new myjdialog(MyFrame.this).setVisible(true);
				}
			});
			container.add(bl);//将按钮添加到容器中去
			jf.setContentPane(container);//将窗体添加到容器中去
			
		}
	}
			
		
	
