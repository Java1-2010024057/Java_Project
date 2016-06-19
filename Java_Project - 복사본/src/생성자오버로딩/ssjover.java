package 생성자오버로딩;

public class ssjover {//생성자오버로딩
	private int num;
	private String name;
	private int age;
	
	ssjover(){
		num=100;
		name="new student";
		age=18;
	}
	//생성자
	ssjover(int num, String name, int age){//매개변수 와 필드의 이름이 같을 때 편리
		this.num=num;//필드
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return "Student [number=" + num + ", name=" + name + ", age=" + age + "]";
	}
}
