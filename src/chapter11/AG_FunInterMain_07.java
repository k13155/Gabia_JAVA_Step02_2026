package chapter11;

public class AG_FunInterMain_07 {
	
	public void test() {
		
		/*FunInter fi = (생략 가능)*/ new FunInter() {
			
			@Override
			public void printData() {
				System.out.println("목요일!!");
			}// printData
			
		}.printData(); // 객체명 대신 메서드 호출(객체명 생략) 
		
	}// test

	public static void main(String[] args) {
		AG_FunInterMain_07 funinter = new AG_FunInterMain_07();
		funinter.test();

	}

}
