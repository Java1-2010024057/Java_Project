package 접근제어;

class A{
	private int a;
	int b;
	public int c;
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		
		//obj.a=10; -> private는 다른 클래스에서 접근 안 됨 
		obj.b=20; // default 접근 가능
		obj.c=30;	// public 접근 가능
	}

}
