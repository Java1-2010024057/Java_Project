package 접근자와설정자;

public class gettersetter {
	private int regnumber;
	private String name;
	private int balance;
	
	//source->generate getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
