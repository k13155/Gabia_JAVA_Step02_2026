package chapter08;

public class Employee_Manager_Main {

	public static void main(String[] args) {

		// Employee 객체 생성후 메서드 사용
		Employee_09 employee = new Employee_09("kim", 2400);
		employee.work();
		employee.getInfo();
		System.out.println();
		
		// Manager 객체 생성후 메서드 사용
		Employee_Manager manager = new Employee_Manager("jang", 5500, "개발자");
		manager.work();
		manager.getInfo();
		manager.approveLeave("kim");
		System.out.println();
		
		// 상속개념이 보이게 객체 생성 후 메서드 사용 (Employee_09와 Employee_Manager의 교집합 기능만 사용가능)
		Employee_09 boss = new Employee_Manager("park", 6000, "영업");
		boss.work();
		boss.getInfo();
		//boss.approveLeave(); // 컴파일 에러(객체이 주체 Employee 타입으로 간주 Manger 고유 기능은 사용 불가능)
		System.out.println();
		
		

	}

}
