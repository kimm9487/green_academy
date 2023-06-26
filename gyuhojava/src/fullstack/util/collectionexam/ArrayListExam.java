package fullstack.util.collectionexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExam {

	public static void main(String[] args) {
		
		ArrayList<FSStudent> gebal = new ArrayList();//빈List 생성함.
		//조장객체를 생성해서 Ele 로 넣어볼게요.
		FSStudent kim = new FSStudent("김규호",100,100,100);
		FSStudent sm = new FSStudent("이승민",10,10,10);
		FSStudent gj = new FSStudent("이교진",95,95,95);
		FSStudent sh = new FSStudent("백승현",90,90,90);
		FSStudent dh = new FSStudent("이도형",90,90,90);
		gebal.add(sm);
		gebal.add(kim);
		gebal.add(gj);
		gebal.add(sh);
		gebal.add(dh);
		
		
		//기존 led 조를 다른 조와 병합을 해볼게요.
		ArrayList<FSStudent> fullgae = new ArrayList<>(gebal);
		FSStudent ahyun = new FSStudent("아현", 89, 89, 89);
		fullgae.add(ahyun);
		
		//led 조가 fullgae 내부에 포함되었는지 확인..
		if(fullgae.containsAll(gebal)) {
			System.out.println("gebal 조는 fullgae 에 포함되어있습니다.");
		}
		
		//led 만 남기고 모두 삭제하기.
		fullgae.retainAll(gebal);
		System.out.println(fullgae.size());
		
		Iterator<FSStudent> it = fullgae.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
		
		
		Collections.sort(fullgae);
		
		for(FSStudent stu : fullgae) {
			System.out.println(stu.getTotal());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
