package �������̽����߻��;

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
	//�ϳ��� Ŭ������ �ϳ��� �������̽� ���
	public void fly2() {
		System.out.println("�ϴ��� ���� ����!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingCar2 car = new FlyingCar2();
		car.fly2();
		car.setSpeed(3);
	}

}
