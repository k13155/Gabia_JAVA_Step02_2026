package chapter13;

public class GenericValue<T> {
	
	// 멤버변수
	T value; // -> Objeck

	
	// 생성자
	
	// 메서드
	public T getValue() { // return을 사용하니까 리턴값도 void가 아니라 T로 써야한다
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	

}
