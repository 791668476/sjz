package third_Operator;

public class Practice_13 {
	public static void main(String [] args) {
		char c = 'a';
		System.out.println(Integer.toBinaryString(c));
		c = 'b';
		System.out.println(Integer.toBinaryString(c));
		c = 'c';
		System.out.println(Integer.toBinaryString(c));
		c = 'd';
		System.out.println(Integer.toBinaryString(c));
		c +=1;
		System.out.println(Integer.toBinaryString(c));
		c = 'A';
		System.out.println(Integer.toBinaryString(c));
		for(int i = 0; i < 26; i++) {
			c +=1;
			System.out.println(Integer.toBinaryString(c));
		}
	}
}
