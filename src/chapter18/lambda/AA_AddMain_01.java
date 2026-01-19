package chapter18.lambda;

public class AA_AddMain_01 {

	public static void main(String[] args) {
		
		// Lambda: 메서드 이름이 없음 -> 매개변수를 활용한 수행문만 존재
		Add addf = (x, y) -> x + y;
		
		System.out.println(addf.Add(3, 5));
		
	}

}
