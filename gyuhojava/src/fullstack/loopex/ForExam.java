package fullstack.loopex;

public class ForExam {

	public static void main(String[] args) {
		/*
		 * 자바의 루프문 : JS 와 마찬가지로 for, for in , while, do~while 모두 사용합니다.
		 * 이중 대표적인 구문은 for 이고 피룡에 따라서 중첩 및 내부에 조건을 넣는
		 * 경우가 많습니다.
		 */

		for(int i = 0; i<10; i++) {
			//루프변수 i 는 반드시 정수 타입이어야 합니다. 위에서의 i 변수는 for 구문에서 처음 나왔기 때문에 for 구문이 끝나면 사라집니다.
			//for 구문에서 처음 나왔기 때문에 for 구문이 끝나면 사라집니다.
				System.out.println(i);
		}
		
		//출력할 단을 입력받아서 for 를 이용해 결과 출력해보세요.
		//ex) 3 입력되면 3 * 1 = 3 ~ 3 * 9 =27 이렇게.
		//int dan = 3;
		//for(int i = 0; i<=9; i++) {
		//	System.out.println(dan + "*" + i + "=" + (dan*i));
		//}
		//이번엔 루프 변수를 위에서 선언 후 루프에 사용, 이후의 값이 변화되는  형태를 봅니다.
		//int i = 20;
		//for(i = 10; i > 0; i--) {
			//위 i 의 초기값 20이 for 에서 10으로 변경됩니다.
			//이후 1이 될때까지 감소하면서 루프를 돌릴게요
			//System.out.println(i);
	//	}
		//여기서 i 의 값을 출력하면 0 입니다.,
		//위처럼 코드 위에서 선언된 변수를 루프에서도 사용할수있습니다.
		//System.out.println("i-->" + i);
		
	

	//이번에 하나 이상의 루프변수를 이용해 봅니다.
	for(int j = 0, k = 10; j<10; j++, k--) {
		System.out.println(j+":"+k);
	}
	//이번엔, 좀 더 특별하게 만들어봅니다.
	//문자 char 는 내부적으로 정수타입인거 알고 있듯이, 이게 연산자를
	//만나면 int 로 변환되어지는 원리를 이용한 루프입니다.
	for(char ch = 'A'; ch <= 'Z'; ch++) {
		System.out.println(ch);
	}
	for(int ii = 65; ii <= 90; ii++) {
		//출력 결과는 A~Z까지 나옵니다.
		System.out.println((char)ii);
	}
	
	//구구단 출력 기억함?
	//아래는 A~Z 까지를 A~Z수만큼 출력
	for(char a = 'A'; a<= 'Z'; a++) {
		//구구단의 단 범위로 생각하면 되겠네요.
		for(char b = 'A'; b <= 'Z'; b++) {
			System.out.println(b);
		}//a가 A인경우 A~Z 출력 완료됨..A=>B
		//공백라인 추가함
		System.out.println();
	}
	
	
	for(char a = 'A'; a<= 'Z'; a++) {
		//구구단의 단 범위로 생각하면 되겠네요.
		for(char b = a; b <= 'Z'-(a-65); b++) {
			System.out.println(b);
		}//a가 A인경우 A~Z 출력 완료됨..A=>B
		//공백라인 추가함
		System.out.println();
	}
	//Label for 구문을 볼게요.
	//짝수단만 출력시키도록 하세요..continue 사용하세요.
	
	//Label loop 구문을 볼게요
	//Label loop 란 루프에 label(이름)을 지정해서
	//제어시에 이름을 호출하면 해당 루프가 제어되는 원리입니다
	//이름 선언 방식은 name : for 구문식입니다.
	Outer: for(int i = 0; i<=9; i++) {
		//짝수단만 출력 continue
		if(i % 2 == 0)
			continue;//이 하위의 로직 개무시..그러면서 outer 조건으로 다시 감.
		Inner: for(int j = 1; j<=9; j++) {
			if((i * j) % 2 == 0)
				break Outer;
			System.out.println(i+"*"+j+"="+(i*j));
			//결과가 홀수인 애만 출력하세요..continue 사용하세요.
		}
		//각 단의 결과 다음에 공백라인 추가
		System.out.println();
	}	
}
	/*
	 * PrintSum 이라는 클래스를 생성 후 아래의 조건대로 나오도록 정의하세요.
	 * 
	 * 먼저, 결과값은 두개의 수를 입력받은 후 해당 범위의 모든수를 누적해서 누적합을 출력하는데,
	 * 문제는 두수의 범위가 반드시 오름차순이어야 한다는 겁니다.
	 * 
	 * 즉 1, 10 을 입력하면 1 ~ 10 까지의 누적합 55,
	 * 반대로 10, 1 을 입력해도 1 ~ 10 까지의 누적합이 나오도록 하라는 말입니다.
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}