package fullstack.referenceEX;

import java.util.Scanner;

public class ScoreJava2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int subjectCount = 3;
	        int[] scores = new int[subjectCount];
	        String[] subjects = {"국어", "영어", "수학"};

	        for (int i = 0; i < subjectCount; i++) {
	            while (true) {
	                System.out.print(subjects[i] + " 과목 점수 입력: ");
	                int score = scanner.nextInt();

	                if (score < 0 || score > 100) {
	                    System.out.println("다시 입력.");
	                } else {
	                    scores[i] = score;
	                    break;
	                }
	            }
	        }

	        int totalScore = 0;
	        for (int score : scores) {
	            totalScore += score;
	        }

	        double average = (double) totalScore / subjectCount;

	        System.out.println("총점: " + totalScore);
	        System.out.println("평균: " + average);

	        char koGrade;
	        if (scores[0] >= 90) {
	            koGrade = 'A';
	        } else if (scores[0] >= 80) {
	            koGrade = 'B';
	        } else {
	            koGrade = 'F';
	        }

	        char engGrade;
	        if (scores[1] >= 90) {
	            engGrade = 'A';
	        } else if (scores[1] >= 80) {
	            engGrade = 'B';
	        } else {
	            engGrade = 'F';
	        }

	        char mathGrade;
	        if (scores[2] >= 90) {
	            mathGrade = 'A';
	        } else if (scores[2] >= 80) {
	            mathGrade = 'B';
	        } else {
	            mathGrade = 'F';
	        }

	        System.out.println("국어 학점: " + koGrade);
	        System.out.println("영어 학점: " + engGrade);
	        System.out.println("수학 학점: " + mathGrade);
		}
       
	}


