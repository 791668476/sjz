package third_Operator;
/**
 * 编写一个具有两个常量值的程序，一个具有交替二进制位1和0，其中最低有效位为0，另一个应具有交替的二进制位
 * 1和0，但是其最低有效位为1。取这两个值，用按位操作符以所有可能的方式结合运算他们，然后用Integer.toBinaryString()显示
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
