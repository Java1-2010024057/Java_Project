package 상속;

public class Rectangle extends Shape {
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double area() {
		return (double) width * height;
	}

	public void draw() {
		System.out.println("(" + this.getX() + "," + this.getY() + ")  : " + "width = " + width + " height =" + height);
		//this.getX() 대신 x 사용 불가 -> private
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Rectangle r2 = new Rectangle();
		r.setX(5);
		r.setY(3);
		r.setWidth(10);
		r.setHeight(20);
		
		r2.setX(8);
		r2.setX(9);
		r2.setWidth(10);
		r2.setHeight(20);
		
		r.print();
		r.draw();
		r2.print();
		r2.draw();
	}

}
