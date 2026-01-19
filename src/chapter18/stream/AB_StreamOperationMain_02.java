package chapter18.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AB_StreamOperationMain_02 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Sophia", "Emma", "Olivia", "Isabella", "Mia");

		Stream<String> stream = list.stream(); // 한 번 사용한 stream은 또 사용못함
		// 중간연산 sorted() 수행후 최종연산 forEach()
		stream.sorted().forEach(System.out::println);

		// 에러 : 한 번 사용한 스트림은 재사용이 안됨
		// 중간연산 sorted() 수행후 최종연산 forEach()
		// stream.filter(s -> s.contains("m")).forEach(System.out::println);

		System.out.println();
		System.out.println("m or M 이 들어간 이름 출력");
		list.stream().filter(s -> s.toUpperCase().contains("M")).forEach(System.out::println);
		// Stream<String> stream1 = list.stream(); 생략됨

		System.out.println();
		System.out.println("이름 길이가 5자 이상인 이름 출력");
		list.stream().filter(name -> name.length() >= 5).forEach(System.out::println);

		// --------------------------------------------------------------
		int arr[] = { 39, 58, 88, 56, 77, 99, 23 };
		
		// 오름차순 정렬 후 출력
		System.out.println();
		System.out.println("오름차순 정렬 후 출력");
		Arrays.stream(arr).sorted().forEach(System.out::println);
		// sorted: 정렬
		
		// 짝수 출력(filter())
		System.out.println();
		System.out.println("짝수 출력");
		Arrays.stream(arr).filter(a -> a % 2 != 1).forEach(System.out::println);
		// Arrays.stream(arr).filter(a -> a % 2 == 0).forEach((i) -> System.out.print(i + " "));
		
		// 배수(filter()) &&
		System.out.println();
		System.out.println("2의 배수도 아니고, 3의 배수도 아닌 숫자 출력");
		Arrays.stream(arr).filter(b -> b % 2 != 0 && b % 3 !=0).forEach(System.out::println);
		// Arrays.stream(arr).filter(b -> b % 2 != 0 && b % 3 !=0).forEach((i) -> System.out.print(i + " "));
		
	}

}
