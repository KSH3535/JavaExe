package ch10.collection01.ch15.sec06.exam02;

/* Queue 는 클래스가 아니라 인터페이스이므로 메서드만 제공
  	주로 LinkedList로 만듦
 * FIFO 시간 순서대로
 * 통신에 주로 쓰임
 */

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		// Queue 컬렉션 생성
		Queue<Message> messageQueue = new LinkedList<>();
		
		// 메시지 넣기
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "김자바"));
		
		// 메시지를 하나씩 꺼내어 처리
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}
}
