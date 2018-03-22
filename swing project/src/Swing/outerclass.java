package Swing;

public class outerclass {
	innerclass in = new innerclass();//在外部实例化内部类对象引用
	public void ouf(){
		in.inf();					//在外部类方法中调用内部类方法
	}
	class innerclass{
		innerclass(){				//内部类构造方法
		}
		public void inf(){			//内部类成员方法
		}
		int y =0;					//定义内部类成员变量
	}
	public innerclass doit(){		//外部类方法，返回值为内部类引用
		//y=4;						//外部类不能直接访问内部类成员变量
		in.y=4;
		return new innerclass();	//返回内部类引用
	}
	public static void main(String args[]){
		outerclass out = new outerclass();
		//内部类的对象实例化操作必须在外部类或外部类的非静态方法中实现
		outerclass.innerclass in = out.doit();
		outerclass.innerclass in2 = out.new innerclass();
	}

}
