package fullstack.objex2;

public abstract class DonColeone {

	String type;
	
	public DonColeone() {
		
	}
	public DonColeone(String type) {
		this.type = type;
	}
	
	public abstract void familyBusiness();
	
	public String toString() {
		return "그의 직업은 " + type;
	}
	
}
