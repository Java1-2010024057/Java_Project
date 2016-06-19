package 상속과다형성;
//동적메소드 호출
class Animal {
	public void sound(){
		System.out.println("Animal Class's sound");
	}
}

class Dog extends Animal {
	public void sound(){//메소드 오버라이딩
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public void sound() {//메소드 오버라이딩
		System.out.println("야옹");
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
		obj.sound();//참조되는 객체의 타입에 따라 결정 -> anmial

		obj = a1;
		obj.sound(); //dog
		
		obj = a2;
		obj.sound();
		
		b.sound();
	}

}
