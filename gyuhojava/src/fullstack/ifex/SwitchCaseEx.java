package fullstack.ifex;

import java.awt.geom.GeneralPath;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		
		/*
		 * switch(조건){case break; case break; default}
		 * 
		 * 로직에서 if 를 이용한 조건 검색이 많아지면 수행 속도가 떨어집니다.
		 * 이때 switch 구문을 이용하면 수행 속도는 월등히 좋아집니다.
		 * 단 편한거 쓰세요.
		 * 
		 * 자바스크립트에서 배운것과 모두 같지만, 단, 하나의 중요한 차이점이 있습니다.
		 * switch(value) <-- value 의 값은 반드시 int 이하만 가능하다는것입니다.
		 * 즉 정수타입만 비교 가능하며, 반드시 int 하위 타입이어야 합니다.
		 * 때문에 대부분이 int 로 비교합니다. 참고로 char 또한 int 와 호환되는걸
		 * 기억하세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 7번째 자리 입력 : ");
		int year = sc.nextInt();
		String gen = "";
		//switch 구문으로 태어난 해 검증해보기.
		
		//결과를 당신은 ?년대에 태어난 여성 or 남성이군요
		//로 출력되도록 로직을 추가하세요

		switch(year) {
		case 9 :
			year = 1800;
			gen = year % 2 ==  0 ? "남자" : "여자";
			break;
		case 0 :
			year = 1800;
			gen = year % 2 ==  0 ? "여자" : "남자";
			break;
		case 1 :
			year = 1900;
			gen = year % 2 ==  0 ? "남자" : "여자";
			break;
		case 2 :
			year = 1900;
			gen = year % 2 ==  0 ? "여자" : "남자";
			break;
		case 3 :
			year = 2000;
			gen = year % 2 ==  0 ? "남자" : "여자";
			break;
		case 4 :
			year = 2000;
			gen = year % 2 ==  0 ? "여자" : "남자";
			break;
		default:
			System.out.println("잘못입력했습니다");
		}
		
		System.out.println("당신은" + year + " 대 생" + gen + "이군요");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
