package 상속과접근제어;

public class Manager extends Employee {
	private int bonus;

	public Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name, address, salary, rrn);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	public void test() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(salary);
		//System.out.println(rrn); 불가능
	}

	//managertest
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager("Tom", "Seoul", 100000, 123456, 50000);
		System.out.println(manager);
		manager.test();
		manager.toString();

	}

}
