package 디폴트메소드와정적메소드;

interface Employable {
	String getName();

	static boolean isEmpty(String str) {//정적메소드
		if (str == null || str.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}
}

class Employee implements Employable {
	private String name;

	public Employee(String name) {
		if (Employable.isEmpty(name) == true) {//정적메소드 호출
			throw new RuntimeException("이름은 반드시 입력하여야 함!");
		}
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employable employee1 = new Employee("hong");
//		Employable employee2 = new Employee("");

	}

}
