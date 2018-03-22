package Swing;
class Parents{
	private final void doit(){
		System.out.println("父类.doit()");
	}
	final void doit2(){
		System.out.println("父类.doit2()");
	}
	final void doit4(){
		System.out.println("父类.doit4()");
	}
}
class Sub extends Parents{
	public final void doit(){
		System.out.println("子类.doit()");
	}
	//final void doit2(){
	//System.out.println("子类doit2（）");
	//}
	public void doit3(){
		System.out.println("子类.doit4()");
	}
}
public class finalmethod {
	public static void mian(String[] args){
		Sub s = new Sub();
		s.doit();
		Parents p = s;
		//p.doit();
		p.doit2();
		p.doit4();
	}

}
