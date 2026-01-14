package chapter10.MultiInterface;

public class AB_CustomerMain_02 {

	public static void main(String[] args) {

		// 자식(Customer)
		Customer customer = new Customer();
		System.out.println("-------Buy-------");
		
		// 부모(Buy)
		Buy buyer = customer;
		buyer.buy();
		buyer.order();

		System.out.println("-------Sell-------");
		Sell seller = customer;
		seller.sell();
		seller.sellorder();
		seller.order();

		// seller 부모 | Customer 자식
		if (seller instanceof Customer) {
			Customer customer2 = (Customer) seller; // 다운 캐스팅 : 부모가 자식이 갖고있는 메서드를 사용하기 위해 캐스팅하는 것
			System.out.println("-------Down Chasting-------");
			customer2.buy();
			customer2.sell();
			customer2.sellorder();
			customer2.order();
		} // if

	}

}
