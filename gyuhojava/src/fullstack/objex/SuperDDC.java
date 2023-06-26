package fullstack.objex;

/*
 * 인터페이스는 자신의 인스턴스를 만들지 못하기에, 이를 구현한(implement) 
 * 한 구현체를 총해 메서드를 기능을 수행합니다.
 * 따라서 인터페이스를 구현한 (implement) 클래스를 무슨무슨 interface
 */
public class SuperDDC extends Animal implements Flyable {

	public SuperDDC(String type) {
		super("슈퍼동물");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("슈퍼 DDC 가 밥먹음");
	}

	@Override
	public void moveNorm(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("슈퍼 DDC 가 " + x + y + " 좌표로 이동함");
	}

	@Override
	public void moveFast(int x, int y) {
		int distance = defMethod(x, y);
		System.out.println("슈퍼 DDC 가 " + x + y + " 좌표로" + Flyable.CAT_SUPER_SPEED + " 이동함");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Super DDC 가 하늘을 날다.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("슈퍼 DDC 가 DDC 라고 소리를 냅니다");
	}
	@Override
	public int defMethod(int x, int y) {
		// TODO Auto-generated method stub
		return Flyable.super.defMethod(x, y);
	}
}
