package ��Ӱ�������;
//�����޼ҵ� ȣ��
class Animal {
	public void sound(){
		System.out.println("Animal Class's sound");
	}
}

class Dog extends Animal {
	public void sound(){//�޼ҵ� �������̵�
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	public void sound() {//�޼ҵ� �������̵�
		System.out.println("�߿�");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
		a = new Animal();
		Dog a1 = new Dog();
		Cat a2 = new Cat();
		
		Animal b = new Dog();
		Animal obj;
		
		obj = a;
		obj.sound();//�����Ǵ� ��ü�� Ÿ�Կ� ���� ���� -> anmial

		obj = a1;
		obj.sound(); //dog
		
		obj = a2;
		obj.sound();
		
		b.sound();
	}

}
