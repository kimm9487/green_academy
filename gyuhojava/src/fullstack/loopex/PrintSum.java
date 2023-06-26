package fullstack.loopex;

import java.util.Scanner;

import fullstack.operator.StaticExam;

public class PrintSum {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	int fir, sec;
    	int sum = 0;
    	
    	System.out.println("첫 번째 수 입력 : ");
    	fir = sc.nextInt();
    	System.out.println("두 번째 수 입력 : ");
    	sec = sc.nextInt();
    	
    	
    	//수 정렬시키기
    	if(fir >= sec) {
    		int temp = fir;
    		fir = sec;
    		sec = temp;
    	}
    	
    	for(int i = fir; i<=sec; i++) {
    		sum += i;
    	}
    	
    	System.out.println(fir + " ~ " + sec + " 누적 합 : " + sum);
    }
}