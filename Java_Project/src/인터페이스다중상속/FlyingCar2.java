package 인터페이스다중상속;

interface Flyable2 {
	void fly2();
}

interface MyConstants {
	int NORTH = 1;
	int EAST = 2;
	int SOUTH = 3;
	int WEST = 4;
}

class Car {
	int speed;
	void setSpeed(int speed){
		this.speed = speed;
	}
}

public class FlyingCar2 extends Car implements Flyable2, MyConstants {
	//하나의 클래스와 하나의 인터페이스 상속
	public void fly2() {
		System.out.println("하늘을 날고 있음!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingCar2 car = new FlyingCar2();
		car.fly2();
		car.setSpeed(3);
	}

}
