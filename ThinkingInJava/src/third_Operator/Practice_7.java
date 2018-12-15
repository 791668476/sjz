package third_Operator;

import java.util.Random;

/*编写一个程序，模拟扔硬币的结果*/

public class Practice_7 {
	public static void main(String[] args) {
		Random random = new Random();
		int nextInt = random.nextInt();
		if(nextInt%2==0){
			System.out.println("正面");
		}else{
			System.out.println("反面");
		}
	}
}
