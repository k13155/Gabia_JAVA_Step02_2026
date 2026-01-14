package chapter09;

public class AB_AnimalMain_02 {

	public static void main(String[] args) {
	 
	  /* 방법 1 (일일이 끌어오는 방법?)
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
	  */	
		
	 // 방법 2 (animalSound 메서드를 사용함)
		animalSound(new Dog());
		animalSound(new Cat());

	}
	
	// animalSound 메서드 만들어서 사용
	public static void animalSound(Animal a) {
		a.sound();
	}

}
