package fullstack.loopex;

import java.util.Scanner;

public class Calc1 {

	public static void main(String[] args) {
		/*
		 * 계산기를 정의 합니다.
		 * 사용자로부터 2개의 수와 연산자를 받아서 계산 후 결과를
		 * 출력하는데, 출력문 이후엔 계속 계산 할지를 물어본 후
		 * y or Y가 입력되면 첨으로 다시 시작되어 수를 입력받고
		 * 연산자 입력 받는 로직이 수행됩니다.
		 * 
		 * 만약 N or n 이 입력되면 좋은 하루보내세요! 라고 출력 후 종료시킵니다.
		 * 
		 * 참고로  switch 구문을 이용 할 분은 연산자 비교를 문자열로 해봐도 좋습니다.
		 */
        Scanner sc = new Scanner(System.in);
        double cal1 = 0;
        String cal2;
        double cal3 = 0;

        while (true) {
            System.out.print("첫 번째 수 입력: ");
            cal1 = sc.nextInt();

            System.out.print("연산자 입력 (+, -, *, /): ");
            cal2 = sc.next();

            System.out.print("두 번째 수 입력: ");
            cal3 = sc.nextInt();

            Double res;
            switch (cal2) {
                case "+":
                    res = cal1 + cal3;
                    break;
                case "-":
                    res = cal1 - cal3;
                    break;
                case "*":
                    res = cal1 * cal3;
                    break;
                case "/":
                        res = cal1 / cal3;
                    break;
                default :
                	System.out.println("잘못된 연산자입니다");
                	continue;
            }

            System.out.println("결과: " + res);

            System.out.print("계속 계산하시겠습니까? (Y/N): ");
            char ch = sc.next().charAt(0);
         
            if (ch == 'n' || ch == 'N') {
                System.out.println("좋은 하루 보내세요!");
                break;
            } else if (ch == 'y' || ch == 'Y') {
                continue;
            } else {
                System.out.println("잘못된 입력입니다. 계산을 종료합니다.");
                break;
            }
         }
            
        //대소문자 구분없이 같은 y인지 확인하는 메서드
        //equalsIgnoreCase("y")
       
		
		
		
		
		
		
		
		
		
	}
	
}
