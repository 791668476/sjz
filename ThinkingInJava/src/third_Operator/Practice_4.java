package third_Operator;

/*��дһ�������ٶȵĳ�������ʹ�õľ����ʱ�䶼�ǳ���*/

class VelocityCalculator {
	static float velocity (float d, float t) {
		if(t == 0) return 0f;
		else return d/t;
	} 
}

public class Practice_4 {
	public static void main(String[] args) {
		float d = 565.3f;
		float t = 3.6f;
		System.out.println("Distance: " + d);
		System.out.println("Time: " + t);
		float v = VelocityCalculator.velocity(d, t);
		System.out.println("Velocity: " + v);		
	}
}