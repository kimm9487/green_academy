package fullstack.util.collectionexam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		
		Map<Integer, Person> students = new HashMap<>();
		
		Person a1 = new Person("김규호", 24, 100);
		students.put(a1.number, a1);
		Person a2 = new Person("이승민", 28, 200);
		students.put(a2.number, a2);
		Person a3 = new Person("이교진", 26, 300);
		students.put(a3.number, a3);
		Person a4 = new Person("백승현", 25, 400);
		students.put(a4.number, a4);
		Person a5 = new Person("이도형", 24, 500);
		students.put(a5.number, a5);
		
		//위 students 에 각 객체의 넘버값을 key 로 해서 put 시켜보세요.
		
		System.out.println(students.size());
		System.out.println(students.containsKey(1));
		System.out.println(students.get(1).name);
		
		Iterator it = students.keySet().iterator();
		ArrayList<Person> values = new ArrayList(students.values());
		while(it.hasNext()) {
			for(Person p : values)
			System.out.println(it.next() + " : " + p.name);
		}
		
	}
		
		/*
		Set set = students.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			//System.out.println(e.getValue());
			System.out.println(e.getKey());
		*/
			
			/*
			Set subset = ((HashMap)e.getValue()).entrySet();
			
			Iterator innerIt =  subset.iterator();
			
			System.out.println("-- " + e.getKey() + " { " + subset.size() + "}");
			*/
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	


