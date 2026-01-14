package chapter14.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	
	private List<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		
		arrayQueue.add(data); // arraylist방에 추가
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		
		if(len == 0)
		{
			System.out.println("큐가 비어 있습니다.");
			return null;
		}
		
		return(arrayQueue.remove(0)); // -> 제일 첫번째것을 가져옴(0번쨰 것)
	}// deQueue

	@Override
	public String toString() {
		return arrayQueue.toString();
	}
	
	
}
