package third_Operator;
/**
 * 以一个最高有效位为1的二进制数字开始用有符号右移操作符对其进行右移，直至所有二进制位都被移出为止，
 * 每次移动一位都要使用Integer.toBinaryString()显示结果
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
