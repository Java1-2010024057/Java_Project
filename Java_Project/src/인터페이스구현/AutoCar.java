package �������̽�����;

public class AutoCar implements OperateCar {
	// private int speed;
	// private int degree;
	// interface���� ���� ��� ��� �ϱ� ������ ���� ����

	public void start() {
		System.out.println("�ڵ����� ����մϴ�.");
	}

	public void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
	}

	public int setSpeed(int speed) {
		System.out.println("�ڵ����� �ӵ��� " + speed + "km/h�� �ٲߴϴ�.");
		return speed;
	}

	public int turn(int degree) {
		System.out.println("�ڵ����� ���⸦ " + degree + "�� ��ŭ �ٲߴϴ�.");
		return degree;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperateCar car = new AutoCar();
		car.start();
		car.setSpeed(30);
		car.turn(115);
		car.stop();

	}

}
