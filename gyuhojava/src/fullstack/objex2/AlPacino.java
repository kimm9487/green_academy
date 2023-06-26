package fullstack.objex2;

import java.security.PublicKey;

public class AlPacino extends DonColeone {

	String name;
	String bread;
	
	public AlPacino(String name, String bread) {
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
	public void secJop() {
		System.out.println("그는 군인을 두 번째 직업으로 갖고 있습니다.");
	}

}
