package ����Ʈ�޼ҵ�������޼ҵ�;

interface Employable {
	String getName();

	static boolean isEmpty(String str) {//�����޼ҵ�
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
		if (Employable.isEmpty(name) == true) {//�����޼ҵ� ȣ��
			throw new RuntimeException("�̸��� �ݵ�� �Է��Ͽ��� ��!");
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
