package fullstack2.langex;

public class WrapperExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Wrapper 클래스 : 중국음식 배달시 랩에 음식이 담겨 오듯이
		 * 자바의 모든 Ptype 을 Wrapping 한 클래스를 말합니다.
		 * 이말은 ptype 과 관련된 정보를 알고 싶을때 사용하라는 의미 입니다.
		 * 클래스명은 ptype 명과 같지만 첫자만 대문자로 시작됩니다.
		 * char 만 Character, int --> Integer 만 차이가 납니다.
		 */
		
		String ten = "10";
		int i = Integer.valueOf(ten) + 1;
		System.out.println(i);
		
		Integer it = 10;
		
	}

}
