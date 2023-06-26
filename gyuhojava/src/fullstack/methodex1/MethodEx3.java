package fullstack.methodex1;

public class MethodEx3 {

	//static void myName(String name, int count) {
	//	for(int i = 0; i<count; i++) {
	//		System.out.println(name);
	//	}
	//}
	
	static int[] makeIntArr(int length) {
		int[] arr = new int[length];
	    for (int i = 0; i <length; i++) {
	        arr[i] = (int) ((Math.random() * 30) + 1);
	        System.out.println(arr[i]);
	    }
		return arr;
	}

	public static void main(String[] args) {
		//myName("김규호", 5);
		
		//생성될 배열의 길이를 int 로 받아서 해당 길이만큼의
		//배열을 생성 후 Math.random() 을 이용해서 1 ~ 30 사이의 정수를
		//랜덤하게 각 index 에 담은 후 결과 배열을 리턴하는 메서드를 정의 및 호출
		//결과까지 확인하세요.
		
		//(int)((Math.random()*30)+1);
		makeIntArr(5);

	
		
	}














}