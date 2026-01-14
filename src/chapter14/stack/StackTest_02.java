package chapter14.stack;

import java.util.ArrayList;

class MyStack {

// 멤버변수
	private ArrayList<String> arrayStack = new ArrayList<String>();

// 메서드
	public void push(String data) {
		arrayStack.add(data);
	}// push

	public String pop() {
		int len = arrayStack.size();

		if (len == 0) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		
		return (arrayStack.remove(len - 1));
	}// pop

	@Override
	public String toString() {
		return arrayStack.toString();
	}

}
public class StackTest_02 {
	
		public static void main(String[] args) {

			MyStack stack = new MyStack();
			stack.push("A");
			stack.push("B");
			stack.push("C");
			// ArrayList
			
			System.out.println(stack);
			
			// pop()
			System.out.println(stack.pop());
			System.out.println(stack.toString());
			System.out.println(stack.pop());
			System.out.println(stack.pop());

			// 출력 데이터 모두 삭제되어 자료 없음
			System.out.println(stack.toString());
		}
		
}

/* Stack을 이용한 순서중 나올 수 없는 순서 고르기
   1)C B A  2)B C A  3)A B C  4)A C B 5) B A C
   
   1) A B C를 순차적으로 넣고 C B A순으로 출력
   2) 나올 수 없는순서
   3) A 넣고 출력 B 넣고 출력 C 넣고 출력
   4) A 넣고 출력 B C를 순차적으로 넣고 C B순으로 출력
   5) A B를 순차적으로 넣고 B A순으로 출력 후 C넣고 바로 출력
*/


