package chapter08;

public class Fruit_InheritanceMain {

	public static void main(String[] args) {

		Fruit_StrawBerry obj = new Fruit_StrawBerry();
		
		obj.Set1("Berry", "여름");
		obj.Set2("딸기", "중");
		obj.Set3("빨강", 12000);
		obj.Disp1();
		System.out.println("-------------------");
		obj.Disp2();
		System.out.println("-------------------");
		obj.Disp3();
		System.out.println("-------------------");

	}

}
