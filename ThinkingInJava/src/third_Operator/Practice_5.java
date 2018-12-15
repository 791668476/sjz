package third_Operator;

/**
 * 创建一个名为Dog的类，它包含两个String域：name和says。在main()方法中创建两个Dog对象，一个名为spot
 * 他的叫声为“Ruff！”，另一个名为scruffy（它的叫声为“Wurf！”）。然后显示他们的名字和叫声
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
