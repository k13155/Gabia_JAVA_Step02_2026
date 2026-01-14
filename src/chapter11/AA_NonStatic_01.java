package chapter11;

import javax.swing.JOptionPane;

// AB_StaticCalssMain_02과 비교
class Out{
	
	// 멤버변수
	static int a = 1;
	
	// 생성자
	
	// 메서드
	
	// 내부 클래스
	public class In{
		
		// 멤버변수
		
		// 생성자
		
		// 메서드
		public String Infun() {
			
			return a + "번째 Non-Static 내부";
		}
		
	}// In class
	
}// Out class


public class AA_NonStatic_01 {

	public static void main(String[] args) {
		// #1 Out class
		Out obj1 = new Out();
		// #2 In class
		Out.In obj2= obj1.new In(); // 메모리 위치가 달라서 객체를 한 번 더 선언
		String str = obj2.Infun();
		
		JOptionPane.showMessageDialog(null, str + "\n Success");

	}

}
