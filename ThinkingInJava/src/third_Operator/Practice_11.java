package third_Operator;
/**
 * ��һ�������ЧλΪ1�Ķ��������ֿ�ʼ���з������Ʋ���������������ƣ�ֱ�����ж�����λ�����Ƴ�Ϊֹ��
 * ÿ���ƶ�һλ��Ҫʹ��Integer.toBinaryString()��ʾ���
 */
public class Practice_11 {
	public static void main(String[] args) {
		int h = 0x10000000;
		System.out.println(Integer.toBinaryString(h));
		for(int i = 0; i < 28; i++) {
			h >>>= 1;
			System.out.println(Integer.toBinaryString(h));
		}
	}
}
