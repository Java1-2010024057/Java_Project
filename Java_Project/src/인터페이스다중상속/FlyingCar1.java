package �������̽����߻��;

interface Drivable {
	void drive();
}

interface Flyable {
	void fly();
}

public class FlyingCar1 implements Drivable, Flyable {//������ �������̽� ���ñ���
	public void drive(){
			System.out.println("�����ϰ� ����!");
		}
	public void fly(){
		System.out.println("�ϴ��� ���� ����!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingCar1 car = new FlyingCar1();
		car.drive();
		car.fly();
		
		
	}

}
