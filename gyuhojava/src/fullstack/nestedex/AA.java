package fullstack.nestedex;
//static inner member class
//주로 사용하는 목적은 Outer 의 정적 멤버를 접근하기 위해서 사용합니다.
// 이 inner 는 static 이기 때문에 인스턴스 생성식도 멤버의 그것과는 좀 다릅니다.
public class AA {

	
	private int a;
	private static String aName;
	
	static class BB{
		//int bb = a;
		String sb = aName;
		static String str = "Hello";
		void bb() {
			//aa();//안됨.. 멤버 메서드를 호출 불가..
			new AA().aa();
			aaa();
		}
	}
	
	void aa() {
		BB bb = new BB();
		System.out.println(BB.str);
	}
	static void aaa() {
		
	}
}
