package fullstack.ifex;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		 /*
		  * if 조건문 : if(조건식 or 논리결과값){
		  *  위 조건식의 결과가 true 시에 수행될 구문 정의
		  *  if 내부에는 로직에 따라 다시 if 가 올 수 있고
		  *  계속 중첩 되어질 수 있습니다
		  *  if 가 없는 else 는 절대 존재할 수 없고, else 절에
		  *  조건식이 들어올 수 없음.
		  *  하나의 조건을 연속으로 검증할때는 else if (조건식){
		  *  	조건식의 결과가 true 시 수행구문 정의
		  *  } 를 계속 나열할 수 있고, 역시 else if 내부에도 if 가 들어올 수 있습니다.
		  *  이처럼 if, else if, else 를 나열시엔, 어느 한 조간이 만족되면
		  *  나머지는 모두 skip 하게 됩니다.
		  *  }
		  */
		//수 두개를 입력 받아서 큰수부터 출력되도록 정의 해 봅니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 수 입력 : ");
		int first = sc.nextInt();
		System.out.println("두 번째 수 입력 : ");
		int sec = sc.nextInt();
		
		//조건을 모두 나열하는 경우를 먼저 정의해봅니다.
		//첫 수가 큰수인지 검증
		//if(first >= sec) {
			//System.out.println(first + " >= " + sec);
		//}else {
			//System.out.println(sec + " >= " + first);
		//}
		
	
		/*
		 * 모든 프로그램에서의 조건은 {} 이 없을 경우엔 무조건 조건의 아래식만 if 의 실행문으로 간주합니다.
		 * 다라서 아래의 구문중 두번째 출력문은 if 구문의 실행문이 아닌
		 * main() 의 실행문이 됩니다.. 꼭 기억하세요.
		 */
		
		
		//else 를 정의하지 않는 방법
		if(first >= sec) {
			System.out.println(first + " >= " + sec);
			return; //명시적으로 void 타입의 메서드를 여기서 종료하라는 의미가 됨.
		}
			System.out.println(sec + " >= " + first); //main() 실행문이 됨
		
			
		/*
		 * FindGreaterNumber 라는 클래스를 생성하세요
		 * 세게의 수를 입력받아서, 큰수부터 나열되도록 조건을 정의하세요
		 * 팁을 드리자면, 임시적으로 사용될 변수가 꼭 필요합니다.
		 * 즉, 입력된 수를 담는 변수 외에 임시 변수가 더 필요하다는 의미입니다.
		 */
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
