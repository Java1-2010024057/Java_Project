package �����ڿ����ε�;

public class Timetest {
	public static void main(String args[]){
		
		Time t1 = new Time();
		System.out.println("�⺻ ������ ȣ�� �� �ð�: " +t1.toString());
		
		Time t2 = new Time(13, 27, 6);
		System.out.println("�ι�° ������ ȣ�� �� �ð�: " +t2.toString());
		
		Time t3 = new Time(99, 66, 42);
		System.out.println("�ùٸ��� ���� ������ ȣ�� �� �ð�: " +t3.toString());
	}
}
