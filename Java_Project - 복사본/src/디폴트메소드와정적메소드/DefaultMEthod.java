package 디폴트메소드와정적메소드;

interface MyInterface{
	public void myMethod1();//추상메소드
	
	default void myMethod2() {//디폴트 메소드
		System.out.println("myMethod2()");
	}
}

public class DefaultMEthod implements MyInterface{
	public void myMethod1(){
		System.out.println("myMethod1()");//추상메소드 구현 필요
	}
	
	public static void main(String[] args){
		DefaultMEthod obj = new DefaultMEthod();
		obj.myMethod1();
		obj.myMethod2();//구현 없이도 이용 가능
	}
}
