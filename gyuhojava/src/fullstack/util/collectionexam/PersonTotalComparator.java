package fullstack.util.collectionexam;

import java.util.Comparator;

public class PersonTotalComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.total == p2.total)return 0;
		else if(p1.total < p2.total) return -1;
		else return 1;
	}
}
