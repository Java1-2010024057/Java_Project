package ��������;

class A{
	private int a;
	int b;
	public int c;
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		
		//obj.a=10; -> private�� �ٸ� Ŭ�������� ���� �� �� 
		obj.b=20; // default ���� ����
		obj.c=30;	// public ���� ����
	}

}
