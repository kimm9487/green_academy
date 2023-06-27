package fullstack.util.collectionexam.genericex;
/*
 * 클래스나 인터페이스를 정의시에 타입을 파라미터로 지정할 수 있습니다.
 * 이 타입은 목적에 따라서 하나 또는 하나 이상이 되어질수 있어요.
 * 이때도 제네릭 코드를 선언해서 타입을 명기 할수 있습니다.
 * 이때 쓰이는 키워드는 어떤 문자(영문자) 가 와도 상관은 없지만,
 * 내부에서는 이 키워드가 타입을 매칭하는 객체로 사용되는 연관성이 있는
 * 키워드를 사용하는것이 좋겠네요. 대문자를 사용하세요.
 */

class GiftBox<K,B>{
	
	private K kind;
	private B brand;
	
	public B getBrand() {
		return brand;
	}
	public K getKind() {
		return kind;
	}
	
	public void setBrand(B brand) {
		this.brand = brand;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
}

class SBuck{
	
}
class MacBook{
	public String toString() {
		return "난 맥북입니다";
	}
}
public class GenericEx2 {
	public static void main(String[] args) {
		
		GiftBox<SBuck,String> fGift = new GiftBox();
		fGift.setKind(new SBuck());
		fGift.setBrand("머그잔셋트");
		
		SBuck first = fGift.getKind();
		System.out.println(fGift.getBrand());
		
		GiftBox<MacBook, Integer> sec = new GiftBox();
		MacBook theGift = sec.getKind();
		sec.setKind(new MacBook());
		sec.setBrand(2);
		System.out.println(sec.getBrand());
		System.out.println(sec.getKind());
		
	}

}
