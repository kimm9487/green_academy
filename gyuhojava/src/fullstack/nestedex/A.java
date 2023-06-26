package fullstack.nestedex;


public class A {//Outer class 로 기억하세요.
	
	//클래스영억에는 보통 필드, 메서드를 일반적으로 정의 했습니다.
	//중첩클래스는 이 영역에 클래스를 정의 하는것을 말합니다.
	
	private int a;
	private B b = new B();//b 필드를 B 인스턴스로 초기화..
	
	
	//Inner 클래스는 접근 제어로 public, default, private 을 선언 할 수 있음.
	public class B{//B라는 Inner 클래스 정의함
		
		String bName = "InnerClass";
		
		public void bMethod() {
			System.out.println(a);
			a();
		}
	}
	
	//생성자 내부에서도 생성가능함
	
	public A() {
		B bb = new B();
	}
	
	//A method 에서도 B 인스턴스 생성가능함
	private void a() {
		B ab = new B();
		//B 클래스의 멤버를 접근해 볼게요.
		System.out.println(ab.bName);
	}
	
}
