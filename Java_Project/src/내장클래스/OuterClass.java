package ����Ŭ����;

public class OuterClass {
	private int value = 10;
	
	class InnerClass {//����Ŭ���� : �ܺ� Ŭ���� private ���� ���� ����
		public void myMethod(){
			
			System.out.println("�ܺ� Ŭ������ private ���� ��:" + value);
		}
	}

	OuterClass(){
		InnerClass obj = new InnerClass(); //����Ŭ���� �̿�
		obj.myMethod();
	}
}
