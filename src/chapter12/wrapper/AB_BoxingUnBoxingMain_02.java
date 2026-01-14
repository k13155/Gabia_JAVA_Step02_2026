package chapter12.wrapper;

public class AB_BoxingUnBoxingMain_02 {

	public static void main(String[] args) {

		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		Integer obj3 = Integer.valueOf(300);
		
		Integer total1 = obj1 + obj2;
		Integer total2 =obj2 + obj3;
		
		System.out.println("Integer total1: " + total1);
		System.out.println("Integer total2: " + total2);
		
		Integer obj = 100;
		System.out.println("value: " + obj.intValue()); // 언박싱(.intValue)
		
		int v = obj; // auto언박싱
		int value1 = obj1.intValue(); // 명시적언박싱
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		Integer total3 = value1 + value2;
		Integer total4 =value2 + value3;
		
		System.out.println("Integer total1: " + total3);
		System.out.println("Integer total2: " + total4);
		
		// int와 Integer은 같은 형이라 (parse)를 굳이 안사용해도 된다.
	}
	
}
