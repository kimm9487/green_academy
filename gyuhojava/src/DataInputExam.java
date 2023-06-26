import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DataInputExam {

	public static void main(String[] args) throws IOException {
		/*
		 * 콘솔로부터 키보드 데이터를 입력 받는 몇가지 방법
		 * 
		 * 1. System.in.read(); --> 이걸 이용하면 콘솔로부터 입력된 첫 번째
		 * 문자 하나만 정수형으로 리턴합니다.
		 * 
		 * 2. Scanner 객체를 이용하는 방법..import java.util.Scanner 확인할것.
		 * Scanner sc = new Scanner(System.in);
		 * sc.nextInt() or next() 메서드를 이용해서 값을 얻어냅니다.
		 * 
		 * 3. JoptionPane 객체를 이용한 UI 로 값 입력받기
		 * 사용법은 아래 코드로 설명합니ㅏㄷ. 단 반드시 import 확인해주세요.
		 */
		
		/* 1번 방법
		 * System.out.print("첫 수 입력하세요. : "); int input = System.in.read();
		 * 
		 * //엔터 처리합니다. //키보드의 입력값 중 1byte 만을 읽어서 int 로 리턴하는 API 입니다. System.in.read();
		 * System.in.read();
		 * 
		 * System.out.print("두번째 수 입력하세요. : "); int input2 = System.in.read();
		 * 
		 * System.out.println("첫 수 값 : " + input); System.out.println("두번째 수 값 : " +
		 * input2);
		 */
		
		
		/*
		 * System.out.println((char)49); System.out.println((char)13);
		 */
		
		//2번 방법
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("첫 수 입력 : "); int first = sc.nextInt();//입력된 키값이 정수(int 범위
		 * 내) 인 경우 //그 값을 그대로 리턴합니다. System.out.println("이름을 입력하세요.. : "); String name =
		 * sc.next();//엔터 전까지의 모든 값을 문자열로 리턴합니다.
		 * 
		 * System.out.println("두번째 수 입력 : "); int sec = sc.nextInt();
		 * 
		 * System.out.println(name + (first + sec));
		 */
		//이름과 첫수 + 두번재수 합산 결과 출력하세요.
		
		//3번 방법
		/*
		 * String value = JOptionPane.showInputDialog("첫 수 입력하세요");
		 * 
		 * System.out.println(Integer.parseInt(value) + 1);
		 */
		
		
		
		
		
	}

}
