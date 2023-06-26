package fullstack.objex2;
/*
 * 영화 대부에서 모티브를 얻은 문제입니다.
 * 
 * 대부는 이탈리안이 뉴욕으로 넘어와서 거대한 마피아 조직을 건설하면서
 * 발생되는 이야기 입니다.
 * 
 * 다음처럼 정의 하세요.
 * 
 * DonColeone 가 원조 대부 입니다.
 * 
 * 자식으로 세명을 슬하에 두고 있는데, AlPacino, RobertDubal, Doojoon 이 있습니다.
 * 
 * 위 원조 대부는 마피아를 조직해서 자식들에게 상속을 하려고 하는데,
 * 이 가업을 메서드로 만드세요. ex>familyBusiness() 로 정의 합니다.
 * 당연히 부모는 내용부가 마피아 두목이 되겠네요
 * 
 * 이 가업을 위 세 아들이 태어나자마자 상속을 받는데, 이 중 AlPacino 만큼은
 * 생각이 틀려서 군에 입대를 하게 됩니다.
 * 
 * 즉 알파치노만 직업이 두 개 인겁니다.(service --> 군에 복무중이다 라는 다른 의미입니다.)
 * 
 * 위 계도를 기준으로 각각 클래스를 정의 하고, 메서드를 상속 받도록 합니다.
 * 이 중 가업은 콜레오네(원조대부) 입장에서는 마피아 두목 1세라고 하고, 나머지들은 마피아 두목 1세의
 * 아들로 나오도록 오버라이드 하세요. 즉 부모의 가업은 그대로 이으면서, 내용만 추가되도록
 * 정의 하라는 뜻.
 * 
 * 알파치노는 실제 군에 복무중이기 때문에, 가업을 물으면 마피아 1세의 아들로 나오지만,
 * 실제 직업은 무엇인지 물으면 군복무 중이라고 나오도록 해야합니다.
 * 
 * 즉 service 의 구현부가 군복무중이라는 내용이란 뜻.
 * 
 * 위 내용을 그대로 클래스를 정의 및 상속 처리하고, 아래의 ItalianJob 클래스의
 * main 에서 각각 인스턴스를 생성하세요.
 * 단, 돈클레오네는 이미 이세상 사람이 아닙니다. (잘 생각해 보세요)
 * 
 * ItalianJob 클래스에는 이 가족의 직업을 출력하도록 하는 메서드를 정의하는데
 * printJobs로 하고 파라미터는 DonColeone[]를 받도록 합니다.
 * 
 * 이 메서드를 호출하면 가족 모두의 직업이 나오는데, 참고로 다시 말하자면
 * 돈클레오네는 이세상 사람이 아닙니다.
 * 이 중 알파치노만 가지고 있는 실제 직업의 내용을 출력하도록 정의 하세요.
 */
public class ItalianJob {

	public static void frintJops(DonColeone[] don) {
	
		for(int i = 0; i<don.length; i++) { 
		   DonColeone donCol = don[i]; 
			 	System.out.println(donCol); 
			 if(donCol instanceof AlPacino) { 
				 ((AlPacino)don[0]).secJop();
			 }
		 }		 
	}
	public static void main(String[] args) {
		
		AlPacino alP = new AlPacino("알파치노", "첫째아들");
		//System.out.println(alP);
		//alP.familyBusiness();
		
		RobertDubal roB = new RobertDubal("로버트듀발", "둘째아들");
		//System.out.println(roB);
		//roB.familyBusiness();
		
		Doojoon doo = new Doojoon("두준", "막내아들");
		//System.out.println(doo);
		//doo.familyBusiness();

		DonColeone[] don = {alP, roB, doo};
		frintJops(don);
		//((AlPacino)alP).secJop();
		//DonColeone.printJops();

	
	}  
}