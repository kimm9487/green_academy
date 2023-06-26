package fullstack.referenceEX;

import java.util.Scanner;

public class MultiScore {

	public static void main(String[] args) {
		/*
		 * 5명의 국영수 점수를 관리하는 프로그램입니다
		 * 다섯명 모두의 국영수 점수를 입력받고, 각 점수범위는 0~100 사이여야 합니다.
		 * 
		 * 모든 점수를 입력 받는 후에 출력  결과는 다음과 같아야 합니다.
		 * 
		 * 1. 아이언맨 총점 : ?, 평균 ?, grade ?
		 * 2. 슈포맨 총점 : ?, 평균 ?, grade ?
		 * 3. 배트맨 총점 : ?, 평균 ?, grade ?
		 * 4. 곰돌이 푸 총점 : ?, 평균 ?, grade ?
		 * 5. 짱구 총점 : ?, 평균 ?, grade ?
		 * 
		 * 조건 1. 점수, 이름, 과목명, 평균, 학점 모두 배열로 사용하세요
		 * 조건 2. 이중 위 학생과 관련된 점수는 반드시 2중 배열로 처리하세요.
		 * 5 * x 의 다중배열을 생성해서 이 배열의 값으로 점수를 관리하세요. 
		 * 조건 3. 출력시 이름은 출력문에서 동적으로 이름을 저장한 배열에서 추출해 출력하세요.
		 * 조건 4. 마지막 루프와 조건을 사용하는 예제이니 반드시 이해하고 본인이 최대한 작성하세요.
		 * 기간 지금부터 내일 2교시 전까지 완성하세요. 그전에 끝나면 더 좋고
		 * 모든 과제는 제출하시고, 구글링하면 바로 알수있으니 알아서 하시길 바랍니다.
		 * 조건 5. 모든 로직에는 주석을 달도록 하세요.
		 */

	      
	      
	        Scanner sc = new Scanner(System.in);
	        
	        String[] names = {"아이언맨", "슈퍼맨", "배트맨", "곰돌이 푸", "짱구"};
	        String[] subjects = {"국어", "영어", "수학"};
	        int[][] scores = new int[5][3];
	        double[] averages = new double[5];
	        char[] grades = new char[5];
	        
	        // 5명의 국영수 점수 입력받기
	        for (int i = 0; i < 5; i++) {
	            System.out.println(names[i] + "의 점수를 입력하세요.");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(subjects[j] + " 점수: ");
	                scores[i][j] = sc.nextInt();
	                
	                // 점수 범위 체크
	                if (scores[i][j] < 0 || scores[i][j] > 100) {
	                    System.out.println("점수는 0에서 100 사이여야 합니다. 다시 입력해주세요.");
	                    j--; // 다시 입력받기 위해 j 값을 감소시킴
	                }
	            }
	            
	            // 평균 계산
	            averages[i] = calculateAverage(scores[i]);
	            
	            // 학점 계산
	            grades[i] = calculateGrade(averages[i]);
	        }
	        
	        // 결과 출력
	        for (int i = 0; i < 5; i++) {
	            System.out.println((i + 1) + ". " + names[i] + " 총점: " + calculateTotalScore(scores[i])
	                    + ", 평균: " + averages[i] + ", 학점: " + grades[i]);
	        }
	    }
	    
	    // 총점 계산 메서드
	    public static int calculateTotalScore(int[] scores) {
	        int totalScore = 0;
	        for (int score : scores) {
	            totalScore += score;
	        }
	        return totalScore;
	    }
	    
	    // 평균 계산 메서드
	    public static double calculateAverage(int[] scores) {
	        return calculateTotalScore(scores) / (double) scores.length;
	    }
	    
	    // 학점 계산 메서드
	    public static char calculateGrade(double average) {
	        if (average >= 90) {
	            return 'A';
	        } else if (average >= 80) {
	            return 'B';
	        } else {
	            return 'F';
	        }
	    }
	}