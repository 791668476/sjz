package third_Operator;

/*����һ������һ��float����࣬�����������չʾ��������ʱ�ı�������*/

class Letter{
	float c;
}

public class Practice_3 {

	static void f(Letter y){
		y.c=2f;
	}
	
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c=1f;
		System.out.println(x.c);
		f(x);
		System.out.println(x.c);
	}
}
