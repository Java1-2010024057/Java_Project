package 상속;

public class Sportscartest {
	public static void main (String[] args){
		SportCar obj = new SportCar(); //자식클래스 객체 생성
		obj.speed=10;
		obj.setSpeed(60); //부모클래스 필드 메소드 사용
		obj.setTurbo(true); //자체 메소드 사용
	}
}
