package third_Operator;

import java.util.Random;

/*��дһ������ģ����Ӳ�ҵĽ��*/

public class Practice_7 {
	public static void main(String[] args) {
		Random random = new Random();
		int nextInt = random.nextInt();
		if(nextInt%2==0){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
	}
}
