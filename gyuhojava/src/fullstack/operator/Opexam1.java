package fullstack.operator;

public class Opexam1 {

	public static void main(String[] args) {
		//아래의 연산식의 결과값과 타입을 계산해보세요.(순서를 염두해두세요)
		//4+5 > 2-1 * 7 && (12 & 3 * 2) > 7 || -2 !=2;
		//산 관 산 산  관   12 & 6  	관 관    관
		//				   1100&110
		//9 > -5 && 0100(4) > 7 || true
		//true && false || true;
		//false || true
		//true;
		
		boolean x = 4+5 > 2-1 * 7 && (12 & 3 * 2) > 7 || -2 !=2;
		System.out.println(x);
		
		//최고 연산자 : ., [], () 1순위
		//단항 연산자 : !. ~(비트반전), +/-(음수 양수 표기), ++/--(선행 증감), (casting)
		//산술 : 4칙 연산 + %
		//쉬프트 : 비트 이동 <<(left shift 연산자 부호비트 안건드림), >>(right shift), <<<
		//관계 : < , >, <=, >= , ==, !=
		//비트 : &, |, ^
		//논리 : &, |, &&, ||
		//삼항 : 조건식 ? true 리턴값 : false 리턴값
		//배정대입 : =, +=, ..............
		//후행증감 : ++/--
		
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		int a = 1;
		System.out.println("1111111111111111111111111111111".length());
		
		System.out.println(Integer.toBinaryString(a<<2));
		//4인 100 비트를 우측으로 3bit 이동했기에 기존 1이 자리한 비트는
		//비트범위 밖이라 삭제됨
		System.out.println(Integer.toBinaryString(a>>3));
		//<<< 3개짜리 left shift(부호비트를 통째로 다 이동시키라는 의미입니다)
		int b = -1;
		System.out.println(Integer.toBinaryString(b));
		//<<<3 하면 부호비트부터 이동이 시작됩니다.
		//이동되는 비트의 자리는 모두 0 으로 채워집니다.
		//따라서 아래의 결과는 음수 -1 이 양수 큰 값으로 변경됩니다/
		System.out.println(Integer.toBinaryString(b>>>3));
		System.out.println(b>>>3);
		
		//비트 반전 연산자 ~ => 모든 비트를 다 반전시킵니다.
		System.out.println(Integer.toBinaryString(~-1));
		
		//비트 AND OR 연산자
		//AND(&) => 두 비트를 비교해서 둘다 1 인 경우만 1로 리턴
		//OR(|) => 두 비트를 비교, 둘다 0인 경우만 0 리턴,, 나머진 모두 1 리턴
		
		int c = 10, d = 14;
		
		System.out.println(c & d);
		System.out.println(c | d);
		
		
		
		
	}

}