package chapter12.string;

public class AA_StringMain_01 {

	public static void main(String[] args) {

		// String -> 불변 객체(Immutable Object)

		String str = "";
		String str1 = "Hi everybody!";
		String str2 = " Have a nice Day!";

		// str1 주소 같음
		System.out.println(System.identityHashCode(str1)); // 1595212853
		str = str1 + str2;

		System.out.println(System.identityHashCode(str)); // 1967205423
		System.out.println(System.identityHashCode(str1)); // 1595212853

		System.out.println(str); // 내용은 바뀌었지만 주소는 바뀌지 않음
		
		// str1.concat 컴파일시 새로운 객체로 문자열이 반환된다.
		str1 = str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); // 42121758
		
		str = str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); // 42121758
		
		System.out.println("str1 글자수: " + str1.length());
		System.out.println("str2 글자수: " + str2.length());

		System.out.println("str1 d글자 위치: " + str1.indexOf('d')); // str1에서 d의 위치
		System.out.println("str2 D글자 위치: " + str2.indexOf('D')); // str2에서 D의 위치

		System.out.println("str1 모두 소문자로: " + str1.toLowerCase());
		System.out.println("str2 모두 소문자로: " + str2.toLowerCase());

		System.out.println("str1 모두 대문자로: " + str1.toUpperCase());
		System.out.println("str2 모두 대문자로: " + str2.toUpperCase());

	}

}
