package 내장클래스;

public class OuterClass {
	private int value = 10;
	
	class InnerClass {//내부클래스 : 외부 클래스 private 변수 참조 가능
		public void myMethod(){
			
			System.out.println("외부 클래스의 private 변수 값:" + value);
		}
	}

	OuterClass(){
		InnerClass obj = new InnerClass(); //내부클래스 이용
		obj.myMethod();
	}
}
