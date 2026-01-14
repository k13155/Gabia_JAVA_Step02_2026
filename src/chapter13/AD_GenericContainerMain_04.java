package chapter13;

public class AD_GenericContainerMain_04 {

	public static void main(String[] args) {

		// 문자열 아이템을 저장하는 객체(stringContainer)
		GenericContainer<String> stringContainer = new GenericContainer<String>(5);
		
		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");
		stringContainer.printItems();
		
		// 타입제한으로 사용 불가능
		// String[] stringArray = { "1", "2", "3", "4", "5"};
		// System.out.println("Sum of int array: " + stringContainer.sum(stringArray));
		
		// 숫자 아이템을 저장하는 객체(integerContainer)
		GenericContainer<Integer> integerContainer = new GenericContainer<Integer>(5);
		integerContainer.addItem(10);
		integerContainer.addItem(20);
		integerContainer.addItem(30);
		integerContainer.printItems();
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of int array: " + integerContainer.sum(intArray));
		
		// 실수 아이템을 저장하는 객체(DoubleContainer)
		GenericContainer<Double> doubleContainer = new GenericContainer<Double>(5);
		doubleContainer.addItem(10.1);
		doubleContainer.addItem(20.1);
		doubleContainer.addItem(30.1);
		doubleContainer.printItems();
		
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		System.out.println("Double of int array: " + doubleContainer.sum(doubleArray));

	}

}
