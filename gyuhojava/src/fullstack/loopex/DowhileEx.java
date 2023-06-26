package fullstack.loopex;

import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {
		/*
		 * do{실행구문}while(조건식); // 반드시 ; 있어야합니다!
		 * while(false) 를 주면 while 구문은 시작도안하지만
		 * do while 구문은 일단 한번은 무조건 실행 후 조건의 결과에 따라서
		 * 재실행 또는 break 를 하게 되는 차이점이 있습니다.
		 */
		
		//int i = 0;
		//do {
		//	System.out.println("do의 실행문");
		//	i += 2;
		//}while(i < 10);
		
		Scanner sc = new Scanner(System.in);
		int subject = 0;
		
		do {
			System.out.println("국어 점수를 입력하세요");
			subject = sc.nextInt();
		}while(subject < 0 || subject > 100);
		
		
		//ScoreJava 클래스를 정의합니다.
		/*
		 * 프로그램이 시작되면 국영수 점수를 입력하세요 라고 메세지를 띄우고
		 * 처음엔 국어 점수를 입력 받도록 하세요.
		 * 다음엔 수학, 영어 순 입니다.
		 * 각 점수의 영역은 반드시 0 ~ 100 이어야하고, 만약 이를 어긴 점수면
		 * 다음 과목 점수입력으로 넘어가지 않아야 합니다.
		 * 
		 * 모든 점수를 입력 받으면, 총점과 평균 그리고 학점을 구하는데,
		 * 학점은 (100 ~ 90) A, (89.999 ~ 80) B, 나머진 F로 하고 평균은 소숫점 세번째 자리에서 반올림 합니다.
		 * 
		 * 평균은 아래처럼 출력시키세요
			System.out.printf("평균 = %.2f\n", 평균 변수);
		 * 
		 * 학점은 grade 하는 변수에 담겨서 A,B,F 로 출력되도록 하세요
		 * 이 grade 학점을 구하는 로직에서 값이 담겨야 합니다.
		 */
		
		
		
	}

}
