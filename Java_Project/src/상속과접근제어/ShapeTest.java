package 상속과접근제어;
//상속과 생성자
class Shape {
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		System.out.println("shape()");
		this.x = x;
		this.y = y;
	}
}

class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		System.out.println("rectangle()");
		this.width = width;
		this.height = height;
	}
	
	double calcArea() {
		return (double)width * height;
	}

}

class ColoredRectangle extends Rectangle {
	private String color;
	
	public ColoredRectangle(int x, int y, int width, int height, String color) {
		super(x, y, width, height);
		System.out.println("ColoredRectangle()");
		this.color = color;
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColoredRectangle c = new ColoredRectangle(10,10,20,20,"red");

	}
}
