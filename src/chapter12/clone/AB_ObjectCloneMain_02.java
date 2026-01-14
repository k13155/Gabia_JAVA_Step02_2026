package chapter12.clone;

public class AB_ObjectCloneMain_02 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle = new Circle(10, 20, 30);
		Circle circlecopy = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(circlecopy);

		// hash코드
		System.out.println(System.identityHashCode(circle)); 
		System.out.println(System.identityHashCode(circlecopy));
		
		// circle과 circlecopy는 서로 같은 결과 값을 갖지만 이 둘의 주소는 서로 다르다
		
	}

}
