package Swing;
import java.util.Random;
public class finalstaticdata {
	private static Random rand2 = new Random();//实例化一个Random类对象
	//随机产生0-10之间的随机数赋予定义为final的a1
	private final int a1 = rand2.nextInt(10);
	//随机产生0-10之间的随机数赋予定义为final的a2
	private static final int a2 = rand2.nextInt(10);
	public static void main(String[] args){
		finalstaticdata fdata = new finalstaticdata();//实例化一个对象
		//调用定义为final的a1
		System.out.println("重新实例化对象调用a1的值"+fdata.a1);
		//调用定义为static final的a2
		System.out.println("重新实例化对象调用a2的值"+fdata.a2);
		//实例化另外一个对象
		finalstaticdata fdata2 = new finalstaticdata();
		System.out.println("重新实例化对象调用a1的值" +fdata2.a1);
		System.out.println("重新实例化对象调用a2的值" +fdata2.a2);
	}

}
