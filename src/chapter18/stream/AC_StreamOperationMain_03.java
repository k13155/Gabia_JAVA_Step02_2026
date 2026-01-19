package chapter18.stream;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AC_StreamOperationMain_03 {

	public static void main(String[] args) {

		// Stream.of(): 객체를 스트림으로 변환
		Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("Ex2"),
				new File("Ex2.bak"), new File("Test.java"));

		// 파일의 확장자를 추출 후 중복 제거하여 출력
		stream.map(File::getName) // 파일 이름 모으기
				.filter(f -> f.indexOf(".") > -1) // 이름에서 확장자가 있는 파일만 추출, 배열에서 앞에서 시작하면 0이지만 뒤에서 시작할땐 -1로 시작하는데 .의 위치가
													// -1 보다 앞에 있는것만 구별
				.map(f -> f.substring(f.lastIndexOf(".") + 1)) // 확장자만 모음, (".") +1 : . 뒤에서부터 하나 뒤 부터 읽어
				.distinct() // 중복제거
				.forEach(System.out::println);

		System.out.println("----------------------------------------------------------");

		// Arrays.asList(): 배열을 스트림으로 변환
		List<String> list = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "State", "Flow", "Sorting",
				"Mapping", "Reduction", "Stream");
		
		// 중간결과 저장 <-- 여기서부터
		Set<String> intermediaResults = new HashSet<>();
		
		List<String> result = list.stream() // list를 stream으로 형변환
				.filter(s -> s.startsWith("S")) // S로 시작한 문자열
				.map(String::toUpperCase) // 모두 대문자
				.distinct() // 중복제거
				.sorted() // 정렬
				.peek(s -> intermediaResults.add(s)) // 중간결과 저장
				.collect(Collectors.toList()); // 새로운 리스트 생성 --> 여기까지 외우기
		
		System.out.println();
		// 중간연산결과
		System.out.println("resfult Result");
		result.forEach((i) -> System.out.println(i + " "));
		

	}

}
