package chapter18.lambda;

public class Quiz {
	
	@FunctionalInterface
	interface Myfunction {

		public int square(int x);

	}

	public static void main(String[] args) {

		Myfunction f = (x) -> x * x;
		System.out.println("12의 제곱근: " + f.square(12));

	}

}
