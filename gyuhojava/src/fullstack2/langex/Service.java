package fullstack2.langex;

public class Service {
	 @PrintAnontaion
	 public void method1() {
		 System.out.println("실행 1");
	 }
	 @PrintAnontaion("*")
	 public void method2() {
		 System.out.println("실행 2");
	 }
	 @PrintAnontaion(value = "#", number = 20)
	 public void method3() {
		 System.out.println("실행 3");
	 }

}
