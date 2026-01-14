package chapter09;

public class AA_ComputerMain_01 {

	public static void main(String[] args) {
		
		// 추상 클래스는 객체를 만들 수 없다
		//Computer c1 = new Computer();
		//Computer c2 = new NotBook();
		
		Computer c3 = new DeskTop();
		Computer c4 = new MyNoteBook();
		
		c3.typing(); // DeskTop
		c3.display(); // DeskTop
		c4.display(); // NoteBook
		c4.typing(); // MyNoteBook
		

	}

}
