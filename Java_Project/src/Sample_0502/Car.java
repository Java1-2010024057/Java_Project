package Sample_0502;

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
	
	static int Car_Numbers(){ return numbers;}

}
