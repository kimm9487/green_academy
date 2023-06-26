package fullstack.objex;

public class Cat extends Animal implements Eatable, Moveable{

	String name;
	String bread;
	String gender;
	
	public Cat(String name, String bread, String gender) {
		super("고양이");
		this.name = name;
		this.bread = bread;
		this.gender = gender;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "이름은 " + name + " 품종은 " + bread + " 성별은 " + gender;
	}
	@Override
	public void sound() {
		System.out.println("냐옹 하고 소리냅니다.");
	
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.type + " 가 먹이를 먹습니다.");
	}
	@Override
	public void moveFast(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(this.type + " 가 " + x + y + "로 " + Moveable.DOG_SUPER_SPEED);
	}
	@Override
	public void moveNorm(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(this.type + " 가 " + x + y + "로 " + Moveable.DOG_NORM_SPEED);
		
	}
}
