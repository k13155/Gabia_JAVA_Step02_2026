package chapter12.string;

public class AB_StringObjectMain_02 {

	public static void main(String[] args) {

		StringObject v1 = new StringObject();
		v1.setVlaue(v1);
		
		System.out.println(v1.getVlaue());

		StringObject v2 = new StringObject();

		//AutoBoxing -> 매개변수에 맞춰서 자동으로 바꿔줌
		//int v2 = new Integer(100); / duoble v2 = new Integer(0.1);
		v2.setVlaue(100);
		System.out.println(v2.getVlaue());
		
		//---------------------------------------
		
		int i = (int)v2.getVlaue(); // unBoxing, vetVlaue();는 100을 가진 Integer 클래스이기 때문에 int로 다운 캐스팅
		System.out.println(i + 2);
		
	}

}
