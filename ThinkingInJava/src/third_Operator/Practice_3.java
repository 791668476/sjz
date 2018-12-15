package third_Operator;

/*创建一个包含一个float域的类，并用这个类来展示方法调用时的别名机制*/

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
