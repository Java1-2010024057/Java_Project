package 정적멤버;
//정적변수, 정적메소드
public class Employee {
	private String name;
	private double salary;
	
	private static int count = 0; //정적변수
	//생성자
	public Employee(String n, double s){
		name = n;
		salary = s;
		count ++;
	}
	
	protected void finalize(){
		count--;
	}
	//정적메소드
	static int getCount(){
		return count;
	}
}
