package fullstack2.langex;
/*
 * java.lang 패키지는 자주 쓰이는 API 패키지 입니다.
 * 따라서 해당 패키지는 따로 import 하지 않아도 자동으로 
 * import java.lang.* 이 컴파일시에 들어갑니다.
 * 나머지 패키지는 반드시 import 해야 합니다.
 */

class Hanul{
	int juminNum;
	
	public Hanul(int juminNum) {
		this.juminNum = juminNum;
	}
	
	//부모의 equals 를 오버라이드 해서 주민 번호가 같은지를 비교해 볼게요.
	//이렇게 하면 이 객체의 equals 를 호출시 Hanul 객체타입의 주민번호를 비교
	//같은지 여부를 리턴하게 됩니다.
	
	@Override
	public boolean equals(Object obj) {
		//NULL Pointer(Reference) Exception
		
		//null 인지여부와, Hanul 타입의 객체인지를 검사한 후
		if(obj !=null && obj instanceof Hanul) {
			return this.juminNum == ((Hanul)obj).juminNum;
		}else {
			return false;
		}
	}
}
public class ObjectEx {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " + 오버라이드 한 내용입니다.";
	}
	public static void main(String[] args) {
		//Hanul 객체 2개를 같은 주민번호로 생성해봅니다.
		Hanul han1 = new Hanul(900101);
		Hanul han2 = new Hanul(900101);
		if(han1.equals(han2)) {
			System.out.println("같은 객체가 아니지만, 주민번호는 같음.");
		}else {
			System.out.println("틀린 객체입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
