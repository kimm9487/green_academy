package fullstack.objex;

import java.awt.image.BufferStrategy;

class Account{
	private String accNo;
	private String name;
	private int balance;
	
	public Account(String accNo, String name, int balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	//객체의 속성값을 외부에 전달하도록 정의하는 메서드를 앞으로 getter 라고 합니다. 꼭 기억.
	public String getAccNo() {
		return accNo;
	}
	public int getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
}
class Loan{//대출 계좌 클래스
	private int loanMoney;
	private String expireDate;
	private String accNo;//대출금 및 이자 입출금 계좌
	private String lName;
	
	//final 키워드 : 클래스, 필드, 메서드에 모두 선언가능합니다.
	//클래스에 선언하면 상속 금지, 필드에 선언하면 상수(즉, 값 변경 금지 및 선언시 반드시 초기화)
	//메서드에 선언하면 오버라이드 금지
	//메서드의 파라미터에 선언되면, 지역내에서 값 변경 금지, 만약 객체라면 객체변경 금지.
	public final static double RATE;//이자율
	
	//프로그램이 실행 시 호출 순서 --> static 초기화 블럭 --> static final field --> static fields --> static methods --> main() --> instance 초기화 블락 -->
	//instance 생성(만약 코드가 있다면)
	
	//static 초기화 블럭을 이용한 final 초기화
	static {
		RATE = 3;
	}
	
	Account acc;
	
	public Loan(int loanMoney, String expireDate) {
		this.loanMoney = loanMoney;
		this.expireDate = expireDate;
		
	}
	
	//대출계좌주의 입출금 계좌와 계좌주 명을 setting 하는 setter 정의함.
	public void setAccNo(Account account) {
		this.accNo = account.getAccNo();
	}
	public void setlName(Account account) {
		this.lName = account.getName();
	}
	
	public String toString() {
		return "대출자 이름 : " + lName + " 금액 : " + loanMoney + "\n" + "계좌번호 : " + accNo + " 대출완납기한 : " + expireDate;
	}

	//월 이자율 계산해서 리턴하는 메서드 정의
	public double getInterest() {
		return this.loanMoney * Loan.RATE/6;
	}
	public static double getRate() {
		return RATE;
	}
	
}



public class StaticExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account gh = new Account("12345", "김규호", 10000);
		Account sm = new Account("67890", "이승민", 10000);
		
		//두사람의 대출 계좌를 생성합니다. 금리는 6.5, 날짜는 2023-12-31
		Loan gLoan = new Loan(5000000, "2023-12-31");
		Loan sLoan = new Loan(5000000, "2023-12-31");
		
		//계좌번호와 이름을 세팅하도록 setter 호출합니다.
		gLoan.setAccNo(gh);
		gLoan.setlName(gh);
		
		sLoan.setAccNo(sm);
		sLoan.setlName(sm);
		
		System.out.println(gLoan);
		System.out.println(sLoan);
		
		//System.out.println(gLoan.getInterest());
		//System.out.println(sLoan.getInterest());
		
		System.out.println(Loan.RATE);
		//Loan.RATE = 5;
		
		
		
	}

}
