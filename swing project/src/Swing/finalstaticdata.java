package Swing;
import java.util.Random;
public class finalstaticdata {
	private static Random rand2 = new Random();//ʵ����һ��Random�����
	//�������0-10֮�����������趨��Ϊfinal��a1
	private final int a1 = rand2.nextInt(10);
	//�������0-10֮�����������趨��Ϊfinal��a2
	private static final int a2 = rand2.nextInt(10);
	public static void main(String[] args){
		finalstaticdata fdata = new finalstaticdata();//ʵ����һ������
		//���ö���Ϊfinal��a1
		System.out.println("����ʵ�����������a1��ֵ"+fdata.a1);
		//���ö���Ϊstatic final��a2
		System.out.println("����ʵ�����������a2��ֵ"+fdata.a2);
		//ʵ��������һ������
		finalstaticdata fdata2 = new finalstaticdata();
		System.out.println("����ʵ�����������a1��ֵ" +fdata2.a1);
		System.out.println("����ʵ�����������a2��ֵ" +fdata2.a2);
	}

}
