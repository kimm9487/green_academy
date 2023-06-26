package fullstack.util.collectionexam;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> aList = new Vector<>();
		
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		
		//Enumeration : Iterator 의 조상격으로 내부순환반복객체라고 생각하시면 됩니다.
		//index 로 관리되어지진 않지만, hasNext() 를통해 Element 의 끝을 
		//파악할수 있도록 합니다. element 를 get 하는 방식은 iterator 와 같습니다.
		
		Enumeration<Integer> enumeration = aList.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
