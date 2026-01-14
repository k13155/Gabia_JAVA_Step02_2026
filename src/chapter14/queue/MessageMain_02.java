package chapter14.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain_02 {

	public static void main(String[] args) {

		Queue<Message> messageQueue = new LinkedList<Message>();

		Message lee = new Message("sendMail", "이호준");
		messageQueue.offer(lee);
		messageQueue.offer(new Message("sendSNS", "김지영"));
		messageQueue.offer(new Message("sendKaKaotalk", "김민주")); // offer는 add나 push와 같은 역할이다(입력)

		// while문은 true일때 돌아가는데 부정(!)을 쓰지 않으면 비어있는 상태일때만 돌아감
		while (!messageQueue.isEmpty()) { // isEmpty 비어있는지 안비어있는지 체크할 수 있는 것 = true, false 블링값
			Message message = messageQueue.poll(); // poll은 출력해주는것 / Queue -> 선입선출

			switch (message.command) {
			case "sendMail": {
				System.out.println(message.to + "님에게 메일을 보냈습니다.");
				break;
			}

			case "sendSNS": {
				System.out.println(message.to + "님에게 SNS을 보냈습니다.");
				break;

			}

			case "sendKaKaotalk": {
				System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
				break;

			}
			}// switch

		} // while

	}// main

}// class
