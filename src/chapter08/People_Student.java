package chapter08;

public class People_Student extends People_04 { //People_04() X
	
	public int studentNo;
	
	public People_Student(String name, String phone, int studentNo) {
		//super(); //People_04() X
		super(name, phone); //People_04(String name, String ssn)를 읽고있음
		this.studentNo = studentNo;
	}

}
