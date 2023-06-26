
public class Fruit {
	public static void main(String args[]) {
		/*
		 * int apple = 7; float happle = apple/24.0F; int pear = 5; float hpear =
		 * pear/24.0F; int orange =5; float horange = orange/24.0F;
		 * 
		 * double res = happle + hpear + horange;
		 */
		int apple, pear, orange;
		
			apple = 7;
			pear = 5;
			orange = 5;
			
		int plus = apple + pear + orange;
		
		float res = (float)(plus/24.0);
		
		System.out.println("세 과일의 하루 24시간 기준 시간당 생산량 : " + res);
	}
}
