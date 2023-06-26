public class HelloWorld {//class block,
	//class body 라고합니다.
	//모든 구문은 반드시 이 영역 내에만 존재해야 합니다.
	
	//아래는 main 메서드입니다.
	//만약 여러분이 하나의 App 을 수백개의 클래스를 정의해서 만들었을때
	//그 프로그램이 실행되려면 반드시 이 main() 을 호출해야합니다.
	//호출은 JVM 이 자동으로 호출해줍니다.
	//즉 main() 은  프로그램의 시작 메서드입니다.
	//따라서 main() 은 하나의 App 에서는 단 하나만 존재해야하며
	//형식은 반드시 아래의 형식과 같아야 합니다. 반드시!
	public static void main(String args[]) {//메서드 바디 method body
		String myName = "김규호";
		System.out.println("안녕하세요" + myName + "님!");
	}
}
