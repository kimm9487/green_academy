package fullstack.methodex1;

import java.util.Scanner;

public class RockPaperScissor {
	/*
	 * 가위 바위 보 게임을 만듭니다.
	 * 조건은 아래와 같습니다.
	 * 
	 * 게임을 시작하면 가위바위보 게임을 시작합니다.
	 * 라고 메세지 출력하세요 
	 * 다음으론 입력 메뉴 : 가위(1 or 가위), 바위(2 or 바위), 보(3 or 보)
	 * 사용자가 엔터를 치면 값을 입력하세요 : 라고 출력
	 * 입력하면, 컴퓨터에서 랜덤한 값 1 ~ 3 을 생성해서 비교합니다.
	 * 이때 컴퓨터의 값은 createCom() 로 정의해서 생성된 값을 되돌려 줍니다.
	 * main에서는 이 값을 받아서 사용자의 값과, 컵 값을 모두 compare() 라는 메서드로
	 * 전달합니다.
	 * compare 메서드는 이 두 값을 받아서 비교하고, 누가 이겼는지의 여부를 문자열로 되돌려 줍니다.
	 * ex > user 승 일 경우 user or com
	 * 리턴 받은 결과를 가지고 사용장에세 아래처럼 출력 하도록 메서드를 호출합니다.(printResult)
	 * printResult() 메서드는 파라미터로 온 값 3개 (사용자값, 컴값, 결과값) 을 받아서
	 * 축 당신 승 : 컴 가위, 당신 바위 
	 * 처럼 출력 시키고 종료합니다.
	 * 
	 * 중요 ! 모든 문자열 값이 같은지는 비교할때는 문자열.equalsIgnoreCase("비교문자열")
	 * 대소문자 구분없이 값만 비교하며, 같으면 true 리턴, 아니면 false 리턴합니다.
	 */
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("게임을 시작합니다.");
        System.out.println("가위(1 or 가위), 바위(2 or 바위), 보(3 or 보) 중 하나를 선택하세요.");

      
        sc.nextLine();

        System.out.print("값을 입력하세요 : ");
        String user = sc.next();

        int createCom = (int) (Math.random() * 3) + 1;

        String userChoice = "";
        String computerChoice = "";
        String result = "";
        
        if (user.equalsIgnoreCase("1") || user.equalsIgnoreCase("가위")) {
            userChoice = "가위";
            if (createCom == 1) {
                computerChoice = "가위";
                result = "무승부";
            } else if (createCom == 2) {
                computerChoice = "바위";
                result = "컴퓨터 승리";
            } else if (createCom == 3) {
                computerChoice = "보";
                result = "사용자 승리";
            }
        } else if (user.equalsIgnoreCase("2") || user.equalsIgnoreCase("바위")) {
            userChoice = "바위";
            if (createCom == 1) {
                computerChoice = "가위";
                result = "사용자 승리";
            } else if (createCom == 2) {
                computerChoice = "바위";
                result = "무승부";
            } else if (createCom == 3) {
                computerChoice = "보";
                result = "컴퓨터 승리";
            }
        } else if (user.equalsIgnoreCase("3") || user.equalsIgnoreCase("보")) {
            userChoice = "보";
            if (createCom == 1) {
                computerChoice = "가위";
                result = "컴퓨터 승리";
            } else if (createCom == 2) {
                computerChoice = "바위";
                result = "사용자 승리";
            } else if (createCom == 3) {
                computerChoice = "보";
                result = "무승부";
            }
        }else {
        	System.out.println("틀린 값입니다. 다시 실행해 주세요.");
        	return;
        }

        printResult(userChoice, computerChoice, result);


    }

    static void printResult(String userChoice, String computerChoice, String result) {
        System.out.println(result + " / " + "당신 : " + userChoice + ", 컴 : " + computerChoice);
    }
}