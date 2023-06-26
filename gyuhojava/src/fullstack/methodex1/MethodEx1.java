package fullstack.methodex1;

import java.security.PublicKey;
import java.util.Arrays;

/*
 * 자바 메서드(method) : 자바를 포함한 모든 객체지향 or 기반 언어들은 모두 method
 * 라는 개념을 가지고 있습니다. 단적으로 말하자면 프로그램이 어떤 일을 수행 할 때 또는 여러분이
 * 수행하라는 명령어를 구현 할 대 실제 그 업무를 담당하는 애가 메서드 입니다.
 * 따라서 메서드에 대한 개념을 잘 알고, 업무(앞으론 Business Logic 이라고 합니다.)
 * 를 코드를 구현하는 대부분의 대상이 이 메서드입니다.
 * 
 * 객체지향에서는 이 메서드를 객체가 어떤 행위(action) 를 할때 그 수단이 메서드라고도 하는데
 * 이 말은 잘 이해가 안될테니, 제가 위에 정의한대로 이해하시면 됩니다.
 * 
 * 메서드 문법 : 앞으로 코드에서 문법에 []가 나오면 optional 이라는 의미입니다.
 * 
 * [public,protected,default,private] [static, abstract] void or return type ==>
 * (좌측에 선언된 걸 리턴타입 이라고 합니다 void 는 리턴이 없다는 의미, p or r type 모두 리턴 가능)
 * methodName(parameter1, 2, ....){//메서드 바디 open
 * 	//메서드가 해야할 일 정의
 *	//만약 리턴
 *}//메서드 바디 close
 * 
 * LIFO(Last In First Out) : 데이터의 적재 및 추출 되는 형태를 나타내는 자료구조의 한 모델로,
 * 대표적인 형태가 자바에서 메서드가 수행될 때 사용되는 stack 메모리 구조이다.
 * 이 말은 메서드가 다른 메서드를 호출할 때, 호출된 메서드는 stack 에서 호출한 메서드보다
 * 위에 존재하기때문에, 호출된 메서드가 모든 작업을 끝낼 때 까지는 호출한 메서드는
 * 다른 작업을 못하는 상태로 유지된다
 * 
 * 
 * 
 * 
 */
public class MethodEx1 {
	//* 을 출력하도록 하는 메서드 정의(define) 합니다.
	static void printStar(int count) {
		/*
		 * try { Thread.sleep(1000 * 10); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		++count;
		for(int i = 0; i < count; i++) {
			System.out.print("*");
			
		}
		System.out.println();
		
	}
	
	//평균을 출력하도록 메서드를 정의합니다.
	static void printAvg(double[] avgArr) {
		
		avgArr[0] = +100;
		System.out.println(Arrays.toString(avgArr));
	}
	public static void main(String[] args) {
		int a = 10;
		printStar(a);//method call
		System.out.println("당신의 점수는 : ");
		printStar(a);//method call
		
		System.out.println(a);
		
		double avg[] = {30,40,50};
		printAvg(avg);
		System.out.println(Arrays.toString(avg)); //call by reference(객체를 파람으로 전달시 Ref가 복사되어 넘어감. 반드시 기억할것)
												  //call by value(벨류를 복사해서 넘어감)
		
		 int[] aa = {1,2,3};		
		 int[] bb = {1,2,3};		
		 //bb=aa; //이걸 선언하면 같은 객체가 됨
		 if(aa == bb) {
			 System.out.println("같은객체입니다");
		 }else {
			 System.out.println("다른객체입니다");
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
