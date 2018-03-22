package Swing;
import java.awt.*;		//����awt��
import java.awt.event.*;//����event��
import javax.swing.*;   //����swing�� 
import javax.print.DocFlavor.URL;

public class JComboBoxModelTest extends JFrame {
	JComboBox jc = new JComboBox(new MyComboBox());
	JLabel jl = new JLabel("��ѡ��֤����");

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
	String[] test = { "���֤", "����֤", "ѧ��֤", "����֤" };

	public Object getElementAt(int index) {// ������������ֵ
		return test[index];
	}

	public int getSize() {// ���������б������Ŀ����Ŀ
		return test.length;
	}

	public void setSelectedItem(Object item) {// ���������б����Ŀ
		selecteditem = (String)item;
	}

	public Object getSelectedItem() {// ��ȡ�����б��е���Ŀ
		return selecteditem;
	}

}
