package fullstack.rockpaperscissor;
import java.util.Scanner;

public class MainGame {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Menual menu = new Menual();
		Random rd = new Random();
		
		menu.printMenu();
		
		int num = 0;
		System.out.println("1 or 가위 , 2 or 바위 , 3 or 보");
		String user=sc.next();
		if (user.equals("1") || user.equals("가위")) {
			num =1;
		}
		if (user.equals("2") || user.equals("바위")) {
			num =2;
		}
		if (user.equals("3") || user.equals("보")) {
			num =3;
		}
		else if (!(user.equals("1") 
				|| user.equals("가위")
				||user.equals("2") 
				|| user.equals("바위")
				||user.equals("3") 
				|| user.equals("보"))) {
			num =4;
		} // 잘못된 값 입력
		
		int a = rd.createCom();
		Compare b = new Compare(num, a);
		b.compare();
		
	
		
		
	}
}
	

	
