package Swing;
import java.awt.*;		//导入awt包
import java.awt.event.*;//导入event包
import javax.swing.*;   //导入swing包 
import javax.print.DocFlavor.URL;

public class JComboBoxModelTest extends JFrame {
	JComboBox jc = new JComboBox(new MyComboBox());
	JLabel jl = new JLabel("请选择证件：");

	public JComboBoxModelTest() {
		Container cp = getContentPane();
		cp.add(jl);
		cp.setLayout(new FlowLayout());
		cp.add(jc);
		setSize(250, 250);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JComboBoxModelTest();
	}

}

class MyComboBox extends AbstractListModel implements ComboBoxModel {
	String selecteditem = null;
	String[] test = { "身份证", "军人证", "学生证", "工作证" };

	public Object getElementAt(int index) {// 返回索引返回值
		return test[index];
	}

	public int getSize() {// 返回下拉列表框中项目的数目
		return test.length;
	}

	public void setSelectedItem(Object item) {// 设置下拉列表框项目
		selecteditem = (String)item;
	}

	public Object getSelectedItem() {// 获取下拉列表中的项目
		return selecteditem;
	}

}
