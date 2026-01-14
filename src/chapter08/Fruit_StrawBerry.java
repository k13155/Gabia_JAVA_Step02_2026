package chapter08;

//extends Fruit_Berry에 클래스가 Fruit_01, Fruit_Berry가 담겨져 있다(class가 Fruit_01, Fruit_Berry, Fruit_StrawBerry 총 3개 들어있는 것)
public class Fruit_StrawBerry extends Fruit_Berry { 
	
	private String color;
	private int price;
	
	//set
	public void Set3(String a, int b) {
		color = a;
		price = b;
	}
	
	// get
	public void Disp3() {
		System.out.println("색깔 : " + color);
		System.out.println("가격 : " + price);
	}

}
