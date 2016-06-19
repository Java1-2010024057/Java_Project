package 상속과다형성;

class Shape {
	protected int x, y;

	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape {
	private int width, height;

	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape {
	private int base, height;

	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle extends Shape {
	private int radius;

	public void draw() {
		System.out.println("Circle Draw");
	}
}

class cylinder extends Shape{
	private int radius, height;
	
	public void draw(){
		System.out.println("Cylinder Draw");
	}
}

// 바인딩
public class ShTest {

	private static Shape arrayOfShapes[];

	public static void printlocation(Shape s){
		System.out.println("x=" + s.x + "y=" + s.y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		init();
		drawAll();
		
		Rectangle s1 = new Rectangle();
		Triangle s2 = new Triangle();
		Circle s3 = new Circle();
		
		/*Shape s4 = new Rectangle();  상향형변환*/
		
		printlocation(s1);
		printlocation(s2);
		printlocation(s3);
	}

	public static void init() {
		arrayOfShapes = new Shape[4];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();
		arrayOfShapes[3] = new cylinder();
	}

	public static void drawAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
	}
	
	
	
	//if ( obj instanceof Rectangle) { }

}
