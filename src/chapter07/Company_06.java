package chapter07;

public class Company_06 { // 싱글톤 코딩

	private static Company_06 instance = new Company_06();
	
	// 일반적인 객체생성
	public Company_06() {
		
	}
	
	public static Company_06 getInstance() {
		
		// 예외처리 -> 생성됨 객체가 없으면 객체 생성
		if(instance == null)
		{
			instance = new Company_06();
		}
		
		return instance;
	}
}
