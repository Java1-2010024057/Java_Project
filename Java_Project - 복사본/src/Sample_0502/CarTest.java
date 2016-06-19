package Sample_0502;

public class CarTest {
	
	//static Car c1= new Car("1", "2", 3);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Car.numbers);
		
		//c1(main 밖에서 만들 때 static을 이용해야  main 에서 쓸 수 있다)
		
		Car c1 = new Car("Prius", "Light Gray", 200);
		Car c2 = new Car("Prius", "Light Gray", 200);
		Car c3 = new Car("Prius", "Light Gray", 200);
		System.out.println(Car.numbers);
		
		int a = Car.Car_Numbers();
		System.out.println(a);
	}
	
}
