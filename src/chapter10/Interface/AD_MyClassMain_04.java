package chapter10.Interface;

public class AD_MyClassMain_04 {

	public static void main(String[] args) {

		MyClass mClass = new MyClass();
		
		mClass.x();
		mClass.y();
		mClass.myMethod();
		System.out.println();

		// X클래스 타입
		X x1 = mClass;
		x1.x();
		
		// Y클래스 타입
		Y y1 = mClass;
		y1.y();
		
		// MyInterface클래스 타입
		MyInterface mi = mClass;
		mi.myMethod();
		mi.x();
		mi.y();

	}

}
