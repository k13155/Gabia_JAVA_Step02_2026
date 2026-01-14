package chapter14.treeset;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name().compareToIgnoreCase(e2.name()); // compareToIgnoreCase: 숫자값으로 앞이큰지 뒤가 큰지 비교(equals랑 비슷한 구조)
	}

}
