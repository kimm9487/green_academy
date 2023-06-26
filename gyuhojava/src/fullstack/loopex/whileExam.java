package fullstack.loopex;

import java.util.Scanner;

public class whileExam {

	public static void main(String[] args) {
		/*
		 * while(조건식 or 조건값){
		 * 조건식 결과가 true 이거나 값이 ture 시 실행구문.
		 * 이 내부에는 피료엥 따라서 if 등의 조건, while 등의 루프, for 등의 loop가
		 * 중첩되어 들어올수 있습니다.
		 * }
		 */

		int count = 0;
		while(true) {
			if(count >= 5)
				break;
			System.out.println(count);
			count++;
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복 횟수 입력하세요 : ");
		int input = sc.nextInt();
		int i = 0;
		while(i <= input) {
			i++;
			System.out.println("ggg");
		}
		
		while(true) {
			System.out.println("게임을 시작하시겠습니까?");
			System.out.println("y / n");
			
			char ch = sc.next().charAt(0);
			
			if(ch == 'n' || ch == 'N') {
				break;
			}
		}
	}

}
