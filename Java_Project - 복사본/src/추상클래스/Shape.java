package 추상클래스;

abstract class Shape {//추상클래스 정의
	private int x, y;
	
	public void move(int x, int y){//보통 메소드도 가능
		this.x = x;
		this.y = y;
		
	}
	public abstract void draw(); //추상메소드 선언
};

class Rectangle extends Shape{
	private int width, height;
	public void draw(){//실제 메소드 구현
		System.out.println("사각형"); 
	}
};

class Circle extends Shape{
	private int radius;
	public void draw(){
		System.out.println("사각형");
	}
};