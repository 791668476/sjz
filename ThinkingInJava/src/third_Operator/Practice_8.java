package third_Operator;
/**
 * 展示用十六进制和八进制记数法来操作long值，用Long.toBinaryString()来显示结果
 *
 */
public class Practice_8 {
	public static void main(String[] args) {
		long n1=0xffff;
		long n2=07777;
		System.out.println(Long.toBinaryString(n1));
		System.out.println(Long.toBinaryString(n2));
	}
}
