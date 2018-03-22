package Swing;
import java.awt.*;	
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutPosition extends JFrame{
	public GridLayoutPosition(){
		Container c = getContentPane();
		//设置容器使用网格布局管理器，设置7行3列的网格
		setLayout(new GridLayout(7,3,5,5));
		for(int i = 0; i<21; i++){
			c.add(new JButton("按钮"+ i));	//循环添加按钮
		}
		setSize(300,300);					//设置窗体大小
		setTitle("这是一个使用网格布局管理器的地方");
		setVisible(true);					//设置窗体可见
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new GridLayoutPosition();
	}
}
