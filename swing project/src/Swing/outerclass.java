package Swing;

public class outerclass {
	innerclass in = new innerclass();//���ⲿʵ�����ڲ����������
	public void ouf(){
		in.inf();					//���ⲿ�෽���е����ڲ��෽��
	}
	class innerclass{
		innerclass(){				//�ڲ��๹�췽��
		}
		public void inf(){			//�ڲ����Ա����
		}
		int y =0;					//�����ڲ����Ա����
	}
	public innerclass doit(){		//�ⲿ�෽��������ֵΪ�ڲ�������
		//y=4;						//�ⲿ�಻��ֱ�ӷ����ڲ����Ա����
		in.y=4;
		return new innerclass();	//�����ڲ�������
	}
	public static void main(String args[]){
		outerclass out = new outerclass();
		//�ڲ���Ķ���ʵ���������������ⲿ����ⲿ��ķǾ�̬������ʵ��
		outerclass.innerclass in = out.doit();
		outerclass.innerclass in2 = out.new innerclass();
	}

}
