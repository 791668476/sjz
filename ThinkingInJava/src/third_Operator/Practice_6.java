package third_Operator;

/*����ϰ5�Ļ����ϣ�����һ���µ�Dog�����������丳ֵΪspot���󡣲�����==��equals()�������Ƚ��������õĽ��*/

public class Practice_6 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("spot","Ruff");
		Dog dog2 =new Dog("scruffy","Wurf");
		System.out.println(dog1.name+"  "+dog1.says);
		System.out.println(dog2.name+"  "+dog2.says);
		
		Dog dog3 = new Dog("spot","Ruff");
		System.out.println(dog1==dog3);
		System.out.println(dog1.equals(dog3));
	}
}
