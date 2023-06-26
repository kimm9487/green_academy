package fullstack.util.collectionexam;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : Collection 의 하위타입으로 리스트와는 틀린 자료 구조를 정의하도록 되어있습니다.
 * 가장큰 특징은 중복 저장을 하지 않는다는 것입니다. List 타입은 중복을 허용하지만
 * set 은 Element 가 추가 될때마다 중복여부를 검사해서 같은 Element(ref 같은)면
 * overwrite 해버립니다.
 * 
 * 이런 특징때문에, Element 를 저장순서를 관리하지 않는 특징을 가지고 있습니다.
 * 대표적인 클래스로는 HashSet(Hash 값을 기준으로 관리하는 클래스 -> 중복여부는 Hash 값을
 * 비교해서 판정합니다), 만약 저장순서까지를 관리하고 싶으면 LinkedHashSet 을 이용합니다.
 * 
 * 마지막으로, 이 Set 타입에는 객체를 저장할때 정렬 알고리즘을 적용한 하위 클래스가 있는데,
 * 대표적으로 TreeSet 과 SortedSet 등이 있습니다.
 */
public class SetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> sh = new HashSet<>();
		sh.add("일");
		sh.add("이");
		sh.add("삼");
		sh.add("일");
		
		System.out.println(sh);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("일");
		lhs.add("이");
		lhs.add("삼");
		lhs.add("일");
		
		System.out.println(lhs);
		
		
		
		//로또생성기 만들어보기.
		//로또는 1 ~ 45 까지의 랜덤한 값을 Set 에 넣을게요..
		//단 조건은 중복이 되면 않됩니다.
		Set<Integer> lotto = new HashSet<>();
		
		for(int i = 0; lotto.size() < 6; i++) {
			int num = (int)((Math.random() * 45) + 1);
			//생성된 번호를 set 에 add 합니다. 만약 중복될 경우엔
			//Element 를 overwrite 하기에, index 는 늘어나지 않는 특징을 이용합니다.
			lotto.add(num);
		}
		
		//위 생성된 set 을 List 타입으로 변경하도록 하게요(호환성 여부 목적)
		//아래 생성자는 Collection 하위 타입을 받도록 되었기 때문에
		//컬렉션의 파람으로 Set 을 넘깁니다.
		List<Integer> lList = new LinkedList<>(lotto);
		//위 리스트를 정렬해주는 Collections 클래스의 sort() 를 이용해서
		//간단히 정렬할게요
		Collections.sort(lList);
		System.out.println(lList);
		
		
		//정렬 알고리즘이 적용된 TreeSet 객체를 생성해서 자동 로또 생성및 자동 정렬해볼게요.
		Set<Integer> treeSet = new TreeSet<>();
		for(int i = 0; treeSet.size() < 6; i++) {
			int num = (int)((Math.random() * 45) + 1);
			//생성된 번호를 set 에 add 합니다. 만약 중복될 경우엔
			//Element 를 overwrite 하기에, index 는 늘어나지 않는 특징을 이용합니다.
			treeSet.add(num);
		}
		System.out.println(treeSet);
		
		
		Person p1 = new Person("홍길동", 1, 300);
		Person p2 = new Person("임꺽정", -1, 120);
		Person p3 = new Person("배트맨", 50, 230);
		
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		for(Person p : ts) {
			System.out.println(p.age);
		}
		
		
		//Comparator를 구현한 클래스를 정렬 조건객체의 파람으로 넘겨서
		//Person 객체의 총점을 자동 정렬토록 합니다.
		
		TreeSet<Person> ts3 = new TreeSet<>(new PersonTotalComparator());
		
		ts3.add(new Person("아현", 10, 500));
		ts3.add(new Person("한울", 10, 501));
		ts3.add(new Person("아연", 10, 500));
		ts3.add(new Person("대성", 10, 499));
		ts3.add(new Person("민건", 10, 502));
		
		//System.out.println(ts3);
		for(Person p : ts3) {
			System.out.println(p.total);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
