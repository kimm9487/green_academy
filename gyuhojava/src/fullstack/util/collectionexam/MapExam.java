package fullstack.util.collectionexam;

import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {

/*
 * Map Interface : Map 의 Collection 의 직접 하이 타입은 아니지만,
 * 내부에 여러 메서드를 통해 필요시 key, value, key AND Value 전체를
 * Collection 타입으로 리턴하도록 정의하고 있습니다.(호환성)
 * 
 * Map 의 대표적 클래스로는 HashMap 이 있고, 초기부터 사용하던 HashTable 은
 * HashMap 으로 대체되었다고 보면 됩니다.
 * 
 * Map 은 데이터(객체) 를 key 로 관리하고, key 는 중복 불가입니다.(덮어씀)
 * 이러한 이유로 Map 은 순차적(index) 등을 통한 Element 접근은 불가능하고
 * 오직 key 로만 Value 를 얻어낼수 있습니다.
 * 
 * 만약 타입 변환이 필요하다면, 메서드를 통해 Collection 타입의 요소로 변환 가능합니다.
 * 
 * 
 */
		
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(1, "일");
		map1.put(2, "이");
		map1.put(3, "삼");
		map1.put(4, "사");
		map1.put(5, "일");
		
		System.out.println(map1.size());
		System.out.println(map1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
