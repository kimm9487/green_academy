package fullstack.methodex1;

import java.util.Scanner;

public class Calc {
	static Scanner sc = new Scanner(System.in);
	
	/*
	 * 계산기를 정의 합니다.
	 * Scanner 객체는 static 필드로 선언 및 초기화 하세요
	 * 더하기, 빼기, 곱하기, 나누기 메서드를 만들고
	 * main 에 두 수와 연산자를 입력받아서 연산자를 확인 후
	 * 해당 메서드를 통해서 연산 결과를 출력하도록 하세요.
	 * 즉, 모든 메서드는 연산 후 결과를 출력해야하며, int 타입의 파라미터 2개를 받도록 정의합니다.
	 */
 

    public static void main(String[] args) {
    	int num1,num2 = 0;
    	
        System.out.print("첫 번째 수 입력 : ");
        num1 = sc.nextInt();

        System.out.print("두 번째 입력 : ");
        num2 = sc.nextInt();

        System.out.println(plus(num1,num2));
        System.out.println(minus(num1,num2));
        System.out.println(muti(num1,num2));
        System.out.println(devide(num1,num2));

        
    }
    static int plus(int num1,int num2) {
    	return num1+num2;
    }
    static int minus(int num1,int num2) {
    	return num1-num2;
    }
    static int muti(int num1,int num2) {
    	return num1*num2;
    }
    static int devide(int num1,int num2) {
    	return num1/num2;
    }
    
    
}
