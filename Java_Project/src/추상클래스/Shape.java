package �߻�Ŭ����;

abstract class Shape {//�߻�Ŭ���� ����
	private int x, y;
	
	public void move(int x, int y){//���� �޼ҵ嵵 ����
		this.x = x;
		this.y = y;
		
	}
	public abstract void draw(); //�߻�޼ҵ� ����
};

class Rectangle extends Shape{
	private int width, height;
	public void draw(){//���� �޼ҵ� ����
		System.out.println("�簢��"); 
	}
};

class Circle extends Shape{
	private int radius;
	public void draw(){
		System.out.println("�簢��");
	}
};