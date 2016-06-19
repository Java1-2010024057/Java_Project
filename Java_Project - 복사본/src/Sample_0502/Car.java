package Sample_0502;
//정적멤버(class member)
public class Car {
	private String model;
	private String color;
	private int speed;
	
	private int id;
	static int numbers = 0;
	
	public Car(String model, String color, int speed) {
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;
		
		id = ++numbers;
	}
	
	//정적메소드
	static int Car_Numbers(){
		return numbers;
		//return speed;//인스턴스변수 설정 불가
	}

}
