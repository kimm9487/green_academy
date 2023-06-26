package fullstack.util.collectionexam;

import lombok.Data;

/*
 * 이 클래스는 여러분 한사람의 정보를 관리하려고 만드는 클래스 입니다.
 * 따라서 관리하고자 하는 속성을 필드로 선언하고, gettter, setter 를 
 * 만들어서 활용할겁니다.
 * 
 * 이러한 기능을 하는 객체를 java 에서는 DTO 라고 말합니다.
 * Data Transfer Object. 즉 Data 를 필요로 하는코드에서는
 * 이런 DTO 를 생성해서 get,set 을 한다는 의미입니다.
 */

@Data
public class FSStudent implements Comparable<FSStudent>{

	public FSStudent(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.total = kor + eng + math;
	}


	private String name;
	//private String tel;
	//private int age;
	private int kor;
	private int eng;
	private int math;
	private int total;//총점 추가함.
	
	@Override
	public int compareTo(FSStudent o) {
		return o.total = this.total;
	}
	
	//int total = 0;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
