package chapter15.treemap;

import java.util.Map;
import java.util.TreeMap;

public class AC_TreeMapEmployeeMain_03 {

	public static void main(String[] args) {

		// TreeMap 객체(employeeMap)
		
		TreeMap<Integer, Employee> employeeMap = new TreeMap<Integer, Employee>();
		
		// 직원의 id를 키로, employeeMap에 Employee 객체 4명 추가
		Employee member1 = new Employee("Alice", 30);
		employeeMap.put(103, member1);
		employeeMap.put(102, new Employee("kim", 25));
		employeeMap.put(101, new Employee("Lee", 34));
		employeeMap.put(104, new Employee("Park", 28));
		
		for(Map.Entry<Integer, Employee> employee : employeeMap.entrySet())
		{
			System.out.println("ID: " + employee.getKey() + "|Name: " + employee.getValue());
		}
		
		// 특정 학생 조회
		int employeeId = 103;
		

	}

}
