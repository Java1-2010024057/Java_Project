interface aa {
	
}

interface bb{
	
}
class a implements aa, bb {
	private int a = 10;
	public void print(){
		System.out.println(a);
	}
	public a() {
		System.out.println("abc");
		// TODO Auto-generated consructor stub
	}
}
class b extends a{

	protected int b = 20;
	
	public void print(){
		System.out.println(b);
	}
	
	public b() {
	System.out.println("abc2");
	// TODO Auto-generated constructor stub
	}

}

class c extends b{

	protected int c = 30;
	public void print(){
		System.out.println(c);
	}
	public c() {
		System.out.println("abc3");
		// TODO Auto-generated constructor stub
	}
}

public class ssdsaas{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a A = new c();
		A.print();
	}

}
