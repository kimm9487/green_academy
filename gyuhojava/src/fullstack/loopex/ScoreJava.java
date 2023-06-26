package fullstack.loopex;

import java.util.Scanner;

public class ScoreJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ko = 0;
		int eng = 0;
		int math = 0;
		
		do {
			System.out.println("국어 점수를 입력하세요");
			ko = sc.nextInt();
			
		}while(ko < 0 || ko > 100);
		do {
			System.out.println("영어 점수를 입력하세요");
			eng = sc.nextInt();
		}while(eng < 0 || eng > 100);
		do {
			System.out.println("수학 점수를 입력하세요");
			math = sc.nextInt();
		}while(math < 0 || math > 100);
		//총점
		double res = ko + eng + math; 
		System.out.println("총점 : " + res);
		//평균
		double avg = res/3;
		System.out.printf("평균 : %.2f\n", avg);
		//if else if 로 했을 때
		//국어 학점
		/* 
		char koGrade;
		if (ko >= 90) {
    		koGrade = 'A';
		} else if (ko >= 80) {
    		koGrade = 'B';
		} else {
    		koGrade = 'F';
		}

		// 영어 학점
		char engGrade;
		if (eng >= 90) {
    		engGrade = 'A';
		} else if (eng >= 80) {
    		engGrade = 'B';
		} else {
    		engGrade = 'F';
		}

		// 수학 학점
		char mathGrade;
		if (math >= 90) {
    		mathGrade = 'A';
		} else if (math >= 80) {
    		mathGrade = 'B';
		} else {
    		mathGrade = 'F';
		}
		*/
		//switch case 로 했을 때
		// 국어 학점
		char koGrade;
		switch(ko) {
		    case 100:
		    case 90:
		        koGrade = 'A';
		        break;
		    case 80:
		        koGrade = 'B';
		        break;
		    default:
		        koGrade = 'F';
		        break;
		}

		// 영어 학점
		char engGrade;
		switch(eng) {
		    case 100:
		    case 90:
		        engGrade = 'A';
		        break;
		    case 80:
		        engGrade = 'B';
		        break;
		    default:
		        engGrade = 'F';
		        break;
		}

		// 수학 학점
		char mathGrade;
		switch(math) {
		    case 100:
		    case 90:
		        mathGrade = 'A';
		        break;
		    case 80:
		        mathGrade = 'B';
		        break;
		    default:
		        mathGrade = 'F';
		        break;
		}

		System.out.println("국어 학점 : " + koGrade);
		System.out.println("영어 학점 : " + engGrade);
		System.out.println("수학 학점 : " + mathGrade);
		}
		
		
		
		
		
	

}
