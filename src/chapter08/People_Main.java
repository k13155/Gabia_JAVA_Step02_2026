package chapter08;

public class People_Main {

	public static void main(String[] args) {

		People_Student student = new People_Student("홍길동", "010-1234-5678", 1000);
		
		System.out.println("name: " + student.name);
		System.out.println("phone: " + student.phone);
		System.out.println("studentNo: " + student.studentNo);

	}

}
