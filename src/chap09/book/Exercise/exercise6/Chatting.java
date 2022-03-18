package chap09.book.Exercise.exercise6;

public class Chatting {
	void startChat(String chatId) {
		String nickname =null;
		//nickname = chatId; final키워드인데 값을 바꾸려함
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData="안녕하세요";
					String message = "["+nickname+"]"+inputData;
					sendMessage(message);
				}
			}
		};
		
		
	}
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
	
}
