package 인터페이스다중상속;

interface Drivable {
	void drive();
}

interface Flyable {
	void fly();
}

public class FlyingCar1 implements Drivable, Flyable {//여러개 인터페이스 동시구현
	public void drive(){
			System.out.println("운전하고 있음!");
		}
	public void fly(){
		System.out.println("하늘을 날고 있음!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingCar1 car = new FlyingCar1();
		car.drive();
		car.fly();
		
		
	}

}
