package chapter09;

// 추상 메서드가 있으면 상속받지 못한다.
// 
public abstract class NoteBook extends Computer{

	// 상속받은 두개의 추상 메서드 중 하나만 정의할 경우 아직도 추상 클래스로 간주
	@Override
	public void display() {
		System.out.println("NoteBook Display()");
		
	}
 
	

}
