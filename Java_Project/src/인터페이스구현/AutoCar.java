package 인터페이스구현;

public class AutoCar implements OperateCar {
	// private int speed;
	// private int degree;
	// interface에서 변수 상수 취급 하기 때문에 생략 가능

	public void start() {
		System.out.println("자동차가 출발합니다.");
	}

	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}

	public int setSpeed(int speed) {
		System.out.println("자동차가 속도를 " + speed + "km/h로 바꿉니다.");
		return speed;
	}

	public int turn(int degree) {
		System.out.println("자동차가 방향를 " + degree + "도 만큼 바꿉니다.");
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
