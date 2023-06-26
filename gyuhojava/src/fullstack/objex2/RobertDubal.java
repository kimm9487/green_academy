package fullstack.objex2;

public class RobertDubal extends DonColeone {

	String name;
	String bread;
	
	public RobertDubal(String name, String bread) {
		super("마피아");
		this.name = name;
		this.bread = bread;
	}
	
	public String toString() {
		return super.toString() + " 이름은 " + name + " 그는 " + bread;
	}
	
	public void familyBusiness() {
		System.out.println("마피아 1세의 아들");
	}
}