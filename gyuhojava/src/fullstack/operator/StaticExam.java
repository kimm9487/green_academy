package fullstack.operator;

import java.util.Scanner;

public class StaticExam {
	
	static int a = 10;//none static field
	
	//입력 객체인 Scanner 를 static 으로 초기화 후 다른 static method 에서
	//사용 할 수 있도록 static 으로 초기화합니다
	//이렇게 static 으로 초기화 하면 다른 static 메서드에서 언제든 필요시마다
	//사용할 수 있습니다.
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("첫 수 입력 : ");
		int a = sc.nextInt();
		/*
		 * static : 현재 이 코드는 main 메서드 내부에 정의되어 있습니다.
		 * 이때 이 메서드에서 호출 할 수 있는 다른 메서드와 필드(변수..앞으로는 변수를 fields 라고 칭합니다)
		 * 는 반드시 static 이어야 합니다.
		 * 이유는 나중에 배우게 됩니다 꼭 기억하세요.
		 * 변수나 메서드 앞에 static 이 붙으면 무조건 static 필드 or method 입니다.
		 * 없으면 인스턴스 필드 or 필드 or 메서드 라고 기억하면 좋겠네요.(몰라도 다시 배웁니다)
		 * 
		 */
		//non static field 사용 해봅니다.
		System.out.println(a);
		//static method 에서 non static method call
		test();
		
		
	}

	static void test() {
		//클래스에서 정의 및 초기화한 Scanner 객체를 사용합니다. (static 이기에 가능함)
		sc.nextInt();
		
	}

}
