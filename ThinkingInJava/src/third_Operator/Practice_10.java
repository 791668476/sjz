package third_Operator;
/**
 * ��дһ��������������ֵ�ĳ���һ�����н��������λ1��0�����������ЧλΪ0����һ��Ӧ���н���Ķ�����λ
 * 1��0�������������ЧλΪ1��ȡ������ֵ���ð�λ�����������п��ܵķ�ʽ����������ǣ�Ȼ����Integer.toBinaryString()��ʾ
 *
 */
public class Practice_10 {
	public static void main(String[] args) {
		int i = 1 + 4 + 16 + 64;
		int j = 2 + 8 + 32 + 128;
		System.out.println("i = " + Integer.toBinaryString(i));
		System.out.println("j = " + Integer.toBinaryString(j));
		System.out.println("i & j = " + Integer.toBinaryString(i & j));
		System.out.println("i | j = " + Integer.toBinaryString(i | j));
		System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
		System.out.println("~i = " + Integer.toBinaryString(~i));
		System.out.println("~j = " + Integer.toBinaryString(~j));
	}
}
