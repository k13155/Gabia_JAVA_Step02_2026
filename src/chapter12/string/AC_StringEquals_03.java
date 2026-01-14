package chapter12.string;

public class AC_StringEquals_03 {

	public static void main(String[] args) {

		String strVar1 = new String("홍길동"); // heap 메모리가 같은지 반환
		String strVar2 = "홍길동"; // 상수풀(JVM에서 특별관리하는 메모리 영역 -> Constant pool(상수))
		
		// 외부 메모리 주소 비교
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}
		
		else {
			System.out.println("다른 String 객체를 참조");
			
		} // -> false
		
		// ------------------------------------------------

		// 내부 메모리 주소 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 String 객체를 참조");
		}
		
		else {
			System.out.println("다른 String 객체를 참조");
			
		} // -> true
		
		System.out.println("------------");
		String str1 = new String("test");
		String str2 = new String("test");
	
		System.out.println(str1 == str2);// heap(메모리)
		System.out.println();
		System.out.println(str1.equals(str2));// data(내용물)
		System.out.println("------------");
		
		String str = "abc"; // 상수풀
		String str3 = "abc";
		System.out.println(str == str3);// 내용을 비교(true)

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("------------");
		System.out.println(i1 == i2);// 다름
		System.out.println();
		System.out.println(i1.equals(i2));// 같음
		
	}

}
