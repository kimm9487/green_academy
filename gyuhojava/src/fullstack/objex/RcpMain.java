package fullstack.objex;

import java.util.Scanner;

public class RcpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sc.nextLine();//엔터처리됩니다.
		Scanner sc = new Scanner(System.in);
		/*
		 * 게임 시작하면 가위바위보 게임을 시작합니다. 라고 메세지 출력 하세요
		 */
		System.out.println("--- 가위 바위 보 게임을 시작합니다. ---");
		/*
		 * 다음으론 입력 메뉴 : 
		 * 가위(1 or 가위), 바위(2 or 바위), 보(3 or 보) 
		 * 사용자가 엔터를 치면 값을 입력 하세요 : 라고
		 * 출력
		 */
		System.out.println("입력 예: 1 or 가위 2 or 바위 3 or 보 중 하나 입력하세요.");
		sc.nextLine();
		System.out.print("입력 해주세요 : " );
		
		/*
		 * 입력 하면, 컴퓨터에서 랜덤한 값 1 ~ 3을 생성해서 비교를 합니다. 
		 * 이때 컴퓨터의 값은 createCom() 로 정의해서 생성된 값을
		 * 되돌려 줍니다.
		 */
		String user = sc.next();
		//위에서 user의 값 입력 받았으니 컴값 생성후 리턴 받도록 메서드 호출합니다.
		
		
		String userValue = null;
		
		//사용자의 값이 문자열 수치 형인 값인 경우만 아래 로직을 태웁니다.
		
		//사용자의 값을 분석해서 1은 가위로, 2는 바위로 3은 보로 변환할게요.
		if(!(user.equals("가위") ||  
		     user.equals("바위") || 
		     user.equals("보"))) {
			//무조건 숫자를 입력 했다는 말임.
			switch (user) {
			case "1":
				//가위
				userValue = "가위";
				break;
			case "2":
				//가위
				userValue = "바위";
				break;
			default:
				userValue = "보";
				break;
			}
		}else {
			//무조건 문자열 값으로 가위 바위 보가 들어왔으니, 이걸 userValue 에 대입해서
			//결과 검증에 사용하도록 합니다.
			userValue = user;
		}
		
		
	}
}
		