package ����Ʈ�޼ҵ�������޼ҵ�;

interface MyInterface{
	public void myMethod1();//�߻�޼ҵ�
	
	default void myMethod2() {//����Ʈ �޼ҵ�
		System.out.println("myMethod2()");
	}
}

public class DefaultMEthod implements MyInterface{
	public void myMethod1(){
		System.out.println("myMethod1()");//�߻�޼ҵ� ���� �ʿ�
	}
	
	public static void main(String[] args){
		DefaultMEthod obj = new DefaultMEthod();
		obj.myMethod1();
		obj.myMethod2();//���� ���̵� �̿� ����
	}
}
