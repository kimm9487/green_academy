package fullstack2.langex;


public class UseMyAnnotaion {

	@MyAnnotaion2
	public void doSome1() {
		System.out.println("doSome1 실행문");
	}
	@MyAnnotaion2(value = "&&&&&&&")
	public void doSome2() {
		System.out.println("doSome2 실행문");
	}
	@MyAnnotaion2(value = "$$$$$$$",number = 30)
	public void doSome3() {
		System.out.println("doSome3 실행문");
	}
}
