package third_Operator;

/**
 * ����һ����ΪDog���࣬����������String��name��says����main()�����д�������Dog����һ����Ϊspot
 * ���Ľ���Ϊ��Ruff��������һ����Ϊscruffy�����Ľ���Ϊ��Wurf��������Ȼ����ʾ���ǵ����ֺͽ���
 *
 */

class Dog{
	String name;
	String says;
	public Dog(String name,String says){
		this.name=name;
		this.says=says;
	}
}

public class Practice_5 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("spot","Ruff");
		Dog dog2 =new Dog("scruffy","Wurf");
		System.out.println(dog1.name+"  "+dog1.says);
		System.out.println(dog2.name+"  "+dog2.says);
	}
}
