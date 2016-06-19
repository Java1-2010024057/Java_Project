package 다른필드초기화;

public class Car {
	int speed;
	
	Car(){
		System.out.println("속도는 " + speed);
	}
	
	{
		speed=100; //다른 필드 초기화
	}
	
	public static void main(String arg[]){
		Car c1 = new Car();
		
		Car c2 = new Car();
	}
}

