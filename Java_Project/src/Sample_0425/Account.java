	 package Sample_0425;

public class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	Account(int regNumber, String name, int balance){
		this.regNumber = regNumber; this.name = name; this.balance = balance;
	}
	
	
	Account(){this(1,"2",1000);};
	
	public String getName(){	return name;	}
	public void setName(String name){	this.name=name;	}
	public int getBalance(){	return balance;	}
	public void setBalance(int balance){	this.balance=balance;	}

}
