package ����Ŭ����;

public class localInner {

	private int data=30;
	
	void display(){
		final String msg="���� ������ ����"; //���������� final �� ����
		
		class Local{//method display()�ȿ��� Ŭ���� local�� ���� -> ����Ŭ������ �޼ҵ� �ȿ����� ��� ����
			void printMsg(){
				System.out.println(msg+data);//�ܺ�Ŭ������ private������ ������ �� �ִ�
			}
		}
		Local obj= new Local();
		obj.printMsg();
		
	}

}

