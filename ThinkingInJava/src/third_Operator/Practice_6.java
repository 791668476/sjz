package third_Operator;

/*在练习5的基础上，创建一个新的Dog索引，并对其赋值为spot对象。测试用==和equals()方法来比较所有引用的结果*/

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
