package �ٸ��ʵ��ʱ�ȭ;

public class Car {
	int speed;
	
	Car(){
		System.out.println("�ӵ��� " + speed);
	}
	
	{
		speed=100; //�ٸ� �ʵ� �ʱ�ȭ
	}
	
	public static void main(String arg[]){
		Car c1 = new Car();
		
		Car c2 = new Car();
	}
}

