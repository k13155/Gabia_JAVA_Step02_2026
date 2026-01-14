package chapter12.wrapper;

import javax.swing.JOptionPane;

public class AC_WrapperMain_03 {

	public static void main(String[] args) {

		String str1 = "";
		String str2 = "";
		char ch = 65; // A
		double num1, num2;
		int num3;
		
		// 언박싱(double(소숫점)과 String(문자)은 서로 다른 형이기 때문에 unBoxing(parse)해준다
		num1 = Double.parseDouble(JOptionPane.showInputDialog("값1"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("값2"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("값3"));

		if(num2 != 0) {
			System.out.println(num1 / num2);
		}
		
		// isDigite: 숫자인지 아닌지
		if(Character.isDigit(ch)) {
			System.out.println(ch + "는 숫자입니다.");
		}
		
		else {
			System.out.println(ch + "는 문자입니다");
		}
		
	}

}
