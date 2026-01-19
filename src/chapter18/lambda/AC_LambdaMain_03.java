package chapter18.lambda;

@FunctionalInterface
interface MyFunctionInterface{
	
	void showMsg(String message);
}

public class AC_LambdaMain_03 { // #1권장ㅣ

	public static void main(String[] args) {

		MyFunctionInterface f = s -> System.out.println(s);
		
		// #1
		f.showMsg("람다식 생성");
		
		// #2
		showMyMsg(f);
		
	}// main
	
	public static void showMyMsg(MyFunctionInterface f) {
		f.showMsg("매개 변수로 사용되는 람다식");
	}
	
}
