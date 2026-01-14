package chapter14.treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEmployeeMain_04 {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee("Alice", 85));
		employees.add(new Employee("Bob", 85));
		employees.add(new Employee("Charlie", 80));

		Collections.sort(employees, new NameComparator());

		System.out.println("학생들의 점수를 기준으로 오름차순 정렬");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println();
		
		Collections.sort(employees, new AgeComparator());
		
		System.out.println("나이를 기준으로 오름차순 정렬");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
