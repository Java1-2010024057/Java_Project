package 지역클래스;

public class localInner {

	private int data=30;
	
	void display(){
		final String msg="현재 데이터 값은"; //지역변수는 final 로 선언
		
		class Local{//method display()안에서 클래스 local이 정의 -> 지역클래스는 메소드 안에서만 사용 가능
			void printMsg(){
				System.out.println(msg+data);//외부클래스의 private변수에 접근할 수 있다
			}
		}
		Local obj= new Local();
		obj.printMsg();
		
	}

}

