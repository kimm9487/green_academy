package fullstack.objex;

class Doggy{
	private String name;
	private int age;
	private String gender;
	private String breed;

	/*
	 * 클래스 생성자(Constructor) : 생성자는 클래스에 정의를 할 수 도, 안할수도 있습니다.
	 * 이 말은 클래스 목적에 따라 여러분이 결정을 한다는 의미입니다.
	 * 하지만 클래스를 바탕으로 객체가 생성되려면 반드시 생성자가 필요합니다.
	 * 이 말은 즉, 모든 클래스는 생성자를 가지고 있어야하고, 이 생성자가 실제 클래스의
	 * 인스턴스를 생성해 준다는 의미입니다 (꼭 기억하세요)
	 * 
	 * 또 하나의 기능으로는 객체를 특정 값으로 필드를 초기화해서 생성 할 수 있는 역할도 합니다.
	 * 
	 * 만약 여러분이 클래스 내에 생성자를 정의 하지않을시엔, 컴파일 과정에서
	 * 컴파일러가 기본 생성자를 자동으로 넣어줍니다.
	 * 
	 * 정말 중요함!! 만약 여러분이 생성자를 정의하는 순간, 컴파일러는 기본생성자를
	 * 절대 제공하지 않습니다. 반드시 !!!!!!!!! 기억하세요
	 * 
	 * 여기서 기본생성자란 모든 속성을 기본값으로 설정하면서, 기본 객체를 생성해 주는걸 말합니다.
	 * 이처럼 생성자는 객체를 생성할때 꼭 필요한 요소인데 생성자는 메서드와 비슷하게 정의됩니다.
	 * 생성자는 메서드처럼 ([필요시에 파람선언가능]) 갖는데, 이름은 반드시 클래스 명과 똑같아야 하며, 리턴타입이 없어야합니다.
	 * 만약 리턴타입을 선언하면 메서드로 간주됩니다.
	 * 
	 */

	//컴파일러가 넣어주는 기본 생성자를 직접 구현해 볼게요.
	/*
	public Doggy() {
		//이 생성자 구현체(body) 에서는 객체의 필드를 초기화 하는 코드를 일반적으로 정의함.
		name = null;
		age = 0;
		breed = null;
		gender = null;
	}
	*/
	
/*
 * 생성자 and 메서드 시그니쳐(Signature) :
 * 생성자나 메서드가 중복되어 정의 되었는지를 판단하는 요소를 뜻합니다.
 * 1. 타입이 같은지(틀리면 중복 아니라고 판단)
 * 2. 갯수가 같은지(틀리면 중복 아니라고 판단)
 * 3. 순서가 같은지(틀리면 중복 아니라고 판단)
 * 
 * 위 세가지의 기준이 모두 같은 경우엔 중복정의(Duplicated) 되었다고 컴파일 에러를 유발합니다.
 */
	
/*
 * 생성자에서 다른 생성자를 호출하는 키워드 this()
 * 이 키워드를 사용하면 주어지는 파라미터를 구분해서 해당하는 생성자를
 * 호출하게되고, 그 생성자가 먼저 수행 후 호출한 생성자의 다음 로직을 수행함.
 * 단, this()는 하나의 생성자에서 단 한번만 호출 가능하며,
 * 반드시 코드 첫머리에서만 호출해야합니다.(꼭 기억하세요)
 */
	//이름만 초기화 하는 생성자 정의합니다.
public Doggy(String name) {//인스턴스 생성 시작됨
	this.name = name;
}//인스턴스 생성 종료됨
	public Doggy(String name, String breed) {//인스턴스 생성 시작함..
		
		this(name);
		this.breed = breed;//필드 초기화함
	}//인스턴스 생성 종료됨
	public Doggy(String name, String breed, String gender) {//인스턴스 생성 시작함..
		this(name, breed);
		this.gender = gender;
	}//인스턴스 생성 종료됨
	public Doggy(String name, String breed, String gender, int age) {//인스턴스 생성 시작함..
		this(name, breed, gender);
		this.age = age;
	}//인스턴스 생성 종료됨
	
	//메서드 오버 로딩(overloading)
	/*
	 * 메서드, 생성자 오버로딩 : 메서드나 생성자가 하는 로직 등은 큰 개념으로 봐선 같으나,
	 * 미세한 부분이 틀릴경우, 같은 메서드의 이름으로 통일하고, 메서드 시그니쳐를 틀리게 하여
	 * 정의 및 필요시 호출하게끔 하는 개념
	 */
void bark() {
	System.out.println(name + " 가 멍멍 하고 짖습니다.");
}
void bark(String fs) {
	System.out.println(name + " 가 더 크게 짖습니다.");
}
void bark(String fs, int count) {
	System.out.println(name + " 가 매우 크게 짖습니다.");
}
void bark(int volum, String fs) {
	System.out.println(name + "이" + volum + "만큼 크게 짖습니다.");
}
void giveHand() {
	System.out.println(name + " 가 손을 내밉니다.");
}
//이 클래스를 바탕으로 생성된 Doggy 객체를 출력문에서 출력시에
//모든 속성의 값이문자열로 리턴되도록 메서드 정의합니다.
//이게 왜 이렇게 되는지는 나중에 상속 때 이해하게 됩니다.
//반드시!!! 저화 똑같이 정의하세요.
	public String toString() {
		return "내 Doggy 의 이름 : " + name + " 성별 : " + gender + " 나이 : " + age + " 품종은 " + breed + " 입니다";
	}
}
public class ObjectEx1 {

	
	public static void main(String[] args) {
		Doggy myDog = new Doggy("요키", "요크셔테리어", "수컷", 14); 
		//instance 를 실제 생성해주는 class 의 생성자 (Constructor) 를 호출하는 코드입니다.
		/*
		  myDog.name = "요키"; 
		  myDog.breed = "요크셔테리어";
		  myDog.age = 14; 
		  myDog.gender ="m";
		 */
		myDog.giveHand();
		myDog.bark();
		//모든 객체를 출력문에 파람으로 넣으면 자동으로 toString 이 호출됩니다.
		//꼭 기억하세요.
		System.out.println(myDog);
		
		
		String myEmail = "aaaa@aaa.com";
	
		
		
		
	}
}


