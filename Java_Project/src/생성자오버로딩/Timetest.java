package 생성자오버로딩;

public class Timetest {
	public static void main(String args[]){
		
		Time t1 = new Time();
		System.out.println("기본 생성자 호출 후 시간: " +t1.toString());
		
		Time t2 = new Time(13, 27, 6);
		System.out.println("두번째 생성자 호출 후 시간: " +t2.toString());
		
		Time t3 = new Time(99, 66, 42);
		System.out.println("올바르지 않은 생성자 호출 후 시간: " +t3.toString());
	}
}
