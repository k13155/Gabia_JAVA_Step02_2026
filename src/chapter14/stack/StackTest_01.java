package chapter14.stack;

import java.util.Stack;

public class StackTest_01 {

	public static void main(String[] args) {
		
		Object obj;
		
		Stack<Object> st = new Stack<>();
		
		if(st.empty())
		{
			for(int i = 0; i < 3; i++)
			{
				st.push(new String("Hi" + i));
				System.out.println("입력 " + i + "번쨰: " + st.peek()); // peek는 읽기만하고 출력은 안함
			}
		}// if
		
		// 하나 출력
		System.out.println();
		System.out.println("현재 출력 데이터: " + st.pop());
		System.out.println("현재 Top의 위치(peek): " + st.peek());
		System.out.println();
		System.out.println("현재 출력 데이터: " + st.pop());
		System.out.println("현재 Top의 위치(peek): " + st.peek());
		System.out.println();
		st.push(new String("everybody"));
		System.out.println("현재 Top의 위치(peek): " + st.peek());
		System.out.println();
		st.push(new String("Happy Day"));
		System.out.println("현재 Top의 위치(peek): " + st.peek()); 
		// Happy Day밑에 everybody가 있지만 제일 위에있는것만 보이는거라 Happy Day가 보이는 상황 
		System.out.println();
		System.out.println("현재 출력 데이터: " + st.pop());
		System.out.println("현재 Top의 위치(peek): " + st.peek()); 
		// -> 제일 위에있던 Happy Day가 출력되면서 그 밑에있던 everybody가 맨 위로 올라온 상황 

	}

}
