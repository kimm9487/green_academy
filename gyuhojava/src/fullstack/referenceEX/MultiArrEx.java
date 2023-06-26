package fullstack.referenceEX;

import java.util.Arrays;

public class MultiArrEx {

	public static void main(String[] args) {
		/*
		 * 다중 배열 중 이차원 배열
		 * 
		 * 배열 내부에 다시 배열을 생성하는 형태로 갯수는 제한 없이 맘대로 생성가능하다
		 * 일반적으로 2~3차원 배열을 주로 사용한다.
		 * 생성식은 이전처럼 3개의 형태를 갖는다.
		 * 
		 * 1. int[] mutil1[] = new int[2][3] => multi1 이라는 APT 에 2개 동을 생성하고
		 * 각 동에는 3가구를 생성한다는 의미.. 따라서 총 가구스는 6개의 가구수이다.
		 * 위 코드는 디본 배열(앞으로 객체에서 기본 객체 또는 기본 배열등이 나오면 무조건 특정 값을 줘서
		 * 그 값으로 초기화 되지 않은, 즉 default value 로 값 또는 필드의 값이 
		 * 초기화 되어 생성된 객체를 통칭합니다. 꼭 기억하세요!)
		 * 을 생성한 코드이기에 2*3 의 격자형(Grid) 형태의 배열이 생성되고, 실제 데이터는
		 * inner 배열의 각 index 에 저장됩니다.
		 * 
		 * 2. int[][] multi2 = {{1,2,3},{4,5,6}}; // 특정 값으로 초기화 한 배열 생성
		 * 위 코드에서 {} 는 Outer 배열 즉 아파트의 한동을 나타내며, 그 값의 수만큼
		 * 가구수가 생성되어 값으로 초기화 됩니다.
		 * 
		 * 3. int multi3 = new int [][]{{1,2},{3,4}}
		 * 위 코드는 Outer 배열은 2개, inner 배열도 2개인 2 * 2 의 배열이 생성되어
		 * 1,2,3,4 라는 값으로 초기화 한 생성식입니다.
		 * 
		 * 꼭 기억할 것 하나더.. 다중배열은 내부에 배열이 존재 하는것이므로
		 * 두 배열 모두 length 라는 속성을 갖습니다. 따라서 이 length 를 잘 이용하는게 핵심입니다.
		 */
		
		int[] multi1[] = new int[2][3];
		//배열의 값을 문자열로 보고 싶을때 이 API 를 이용하면 쉽게 볼 수 있어요.
		
		//System.out.println(Arrays.toString(multi1));
		
		for(int i = 0; i<multi1.length; i++) {
			//이 영역은 아파트의 동을 진입했습니다
			for(int j = 0; j< multi1[i].length; j++) {
				System.out.println(multi1[i][j]);
			}
		}
		
		String myApt[][] = {{"한울","아현"},{"기열", "지호"},{"수정", "서영"}};//myApt.length
		for(int i = 0; i<myApt.length; i++) {
			for(int j = 0; j<myApt[i].length; j++) {
				System.out.println(myApt[i][j]);
			}
		}
		//동적가변배열이라고 있습니다. 잘 안쓰이지만 서비스로..
		//머리에 그리세요
		
		char[] stars[] = new char [10][];
		for(int i = 0; i < stars.length; i++) {
			//가구를 만들게요..
			stars[i] = new char [i + 1];
			for(int j = 0; j < stars[i].length; j++) {
				stars[i][j] = '*'; 
				
				System.out.println(stars[i][j]);
			}
			System.out.println();
		}
		// 클래스 명 MultiScore
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
