package 접근자와설정자;

public class gettersettertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gettersetter obj = new gettersetter();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + "입니다.");
	
		gettersetter ac1 = new gettersetter ();
	}

}
