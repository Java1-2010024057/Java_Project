package �����ڿ����ε�;

public class ssjover {//�����ڿ����ε�
	private int num;
	private String name;
	private int age;
	
	ssjover(){
		num=100;
		name="new student";
		age=18;
	}
	//������
	ssjover(int num, String name, int age){//�Ű����� �� �ʵ��� �̸��� ���� �� ��
		this.num=num;//�ʵ�
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return "Student [number=" + num + ", name=" + name + ", age=" + age + "]";
	}
}
