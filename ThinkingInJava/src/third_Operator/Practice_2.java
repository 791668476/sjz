package third_Operator;

/*����һ������һ��float����࣬�����������չʾ��������*/

class Tank{
	float level;
}

public class Practice_2 {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level=9.0f;
		t2.level=47.0f;
		System.out.println("t1.level="+t1.level+"  t2.level="+t2.level);
		t1=t2;
		System.out.println("t1.level="+t1.level+"  t2.level="+t2.level);
		t1.level=27f;
		System.out.println("t1.level="+t1.level+"  t2.level="+t2.level);
	}
}
