package 무명클래스;

interface RemoteControl{
	void turnOn();
	void turnOff();
} 

public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl(){ // 무명클래스 정의
			public void turnOn(){
				System.out.println("TV turnOn()");
			}
			public void turnOff(){
				System.out.println("TV turnOff()");
			}
		};
		ac.turnOn();
		ac.turnOff();
	}

}
