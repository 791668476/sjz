package third_Operator;

public class Practice_14 {
	
	public static void practice_14(String one,String two){
		System.out.println(one==two);
		System.out.println(one!=two);
		System.out.println(one.equals(two));
		System.out.println(two.equals(one));
	}
	
	public static void main(String[] args) {
		practice_14("one","two");
	}
}
