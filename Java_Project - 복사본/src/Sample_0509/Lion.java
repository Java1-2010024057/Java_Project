package Sample_0509;

public class Lion extends Animal {
	private int legs = 4;
	void roar(){
		weight = 80;
		System.out.println("roar()가 호출되었슴");
		
	}
	
	void setPicture(String s) {
		picture = s;
		System.out.println(picture);
	}
}
