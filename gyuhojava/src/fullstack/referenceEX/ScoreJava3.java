package fullstack.referenceEX;

import java.util.Scanner;

public class ScoreJava3 {

	public static void main(String[] args) {
		//ScoreJava2 와 같은 내용으로 결과가 나오도록 정의하는데
		//아래의 코드를 완성하세요
		Scanner sc = new Scanner(System.in);
		String subject[] = {"국어", "영어", "수학"};
		int[] scores = new int[subject.length + 1];
		//scores 배열도 이전과 같음
		//평균, 학점 변수도 같음
		for(int i = 0; i < subject.length; i++) {
			//여기에 do while 한번만 넣으면 이 for 구문 내에서 평균을
			//제외한 과목별 점수, 총점이 모두 구해져야 합니다.
			//또한 점수가 올바르지 않을 경우엔 절대 다음과목의
			//점수로 입력되어선 안됩니다.
			do {
				System.out.println(subject[i] + " 점수입력 : ");
				scores[i] = sc.nextInt();
			}while (scores[i] < 0 || scores[i] > 100);
			scores[subject.length] += scores[i];
		}
		//scores[subject.length] += scores;
	}

}
